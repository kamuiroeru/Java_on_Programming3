import javax.swing.*;
import java.awt.*;

public class H213 extends JPanel {
    private final static int X_REV = 50, Y_REV = 10,
            GRAPH_HEIGHT = 400, GRAPH_WEIGHT = 800,
            OFFSET = 0, FONT_SIZE = 20;
    private final static int xMidPoint = GRAPH_WEIGHT / 2 + X_REV,
            yMidPoint = GRAPH_HEIGHT / 2 + Y_REV;

    public H213() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(GRAPH_WEIGHT + X_REV * 2, GRAPH_HEIGHT + Y_REV * 2));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(X_REV, Y_REV, GRAPH_WEIGHT, GRAPH_HEIGHT);
        g.drawLine(X_REV, yMidPoint, GRAPH_WEIGHT + X_REV, yMidPoint);
        g.drawLine(xMidPoint, Y_REV, xMidPoint, GRAPH_HEIGHT + Y_REV);
        int x[] = new int[GRAPH_WEIGHT], y[] = new int[GRAPH_WEIGHT];
        for (int i = 0; i < GRAPH_WEIGHT; i++) {
            x[i] = i + X_REV;
            y[i] = (int) ((-1) * (GRAPH_HEIGHT / 2) * Math.sin((i - OFFSET) * (4 * Math.PI / GRAPH_WEIGHT) - 2 * Math.PI))
                    + yMidPoint;
        }
        g.drawPolyline(x, y, GRAPH_WEIGHT);
        g.setFont(new Font("Times New Roman", Font.PLAIN, FONT_SIZE));
        g.drawString("0", xMidPoint + 4, yMidPoint + FONT_SIZE);
        g.drawString("1", xMidPoint - 12, Y_REV + FONT_SIZE);
        g.drawString("-1", xMidPoint + 4, GRAPH_HEIGHT + Y_REV - 4);
        g.drawString("-2π", X_REV + 4, yMidPoint + FONT_SIZE);
        g.drawString("2π", GRAPH_WEIGHT + X_REV + 4, yMidPoint + FONT_SIZE);
        g.drawString("-π", (xMidPoint + X_REV) / 2 + 4, yMidPoint - 4);
        g.drawString("π",(GRAPH_WEIGHT + X_REV + xMidPoint) / 2 + 4, yMidPoint - 4);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H213 h = new H213();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}