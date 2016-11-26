import javax.swing.*;
import java.awt.*;
public class E212 extends JPanel {
    public E212() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(250, 250));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.setFont(new Font("IPAexGothic", Font.PLAIN, 20));
        g.drawRect(10, 60, 30, 50);
        g.drawString("長方形", 0, 130);
        g.setColor(Color.red);
        g.setFont(new Font("IPAexGothic", Font.BOLD, 15));
        g.drawLine(50, 50, 140, 140);
        g.drawLine(140, 50, 50, 140);
        g.drawString("直線", 80, 130);
        g.setColor(Color.blue);
        g.setFont(new Font("IPAexGothic", Font.PLAIN, 15));
        g.drawOval(80, 140, 50, 80);
        g.drawString("楕円", 130, 220);
        int x[] = new int[6];
        int y[] = new int[6];
        for (int i = 0; i < 6; i++) {
            y[i] = (int) (50 * Math.cos(Math.toRadians(i * 60)) + 95);
            x[i] = (int) (50 * Math.sin(Math.toRadians(i * 60)) + 200);
        }
        g.setColor(Color.black);
        g.setFont(new Font("IPAexMincho", Font.ITALIC, 20));
        g.drawPolygon(new Polygon(x, y, 6));
        g.drawString("六角形", 160, 160);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E212 h = new E212();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}