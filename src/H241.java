import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class H241 extends JPanel implements ActionListener {
    private JButton rec, circle, line;
    private String select[] = {"なし", "黒", "赤", "黄", "緑", "青"};
    private Color colors[] = {Color.white, Color.black, Color.red, Color.yellow, Color.green, Color.blue};
    private JComboBox<String> lineColBox = new JComboBox<>(select);
    private JComboBox<String> coverColBox = new JComboBox<>(select);
    private final int RECT = 0;
    private final int OVAL = 1;
    private final int LINE = 2;
    private int shape = RECT;

    private H241() {
        DrawByMouse drawBoard = new DrawByMouse();
        JPanel buttonPanel = new JPanel();
        JPanel settingPanel = new JPanel(new GridLayout(2, 0));

        rec = new JButton("四角"); circle = new JButton("楕円"); line = new JButton("直線");
        rec.addActionListener(this); circle.addActionListener(this); line.addActionListener(this);
        buttonPanel.add(rec); buttonPanel.add(circle); buttonPanel.add(line);

        lineColBox.setSelectedIndex(1);
        coverColBox.setSelectedIndex(0);
        JLabel lineColLabel = new JLabel("線の色");
        JLabel fillColLabel = new JLabel("塗りつぶしの色");
        settingPanel.add(lineColLabel); settingPanel.add(lineColBox);
        settingPanel.add(fillColLabel); settingPanel.add(coverColBox);

        add(drawBoard);
        add(buttonPanel);
        add(settingPanel);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == rec) shape = RECT;
        if (obj == circle) shape = OVAL;
        if (obj == line) shape = LINE;
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Draw Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H241 e = new H241();
        frame.add(e, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private class DrawByMouse extends JPanel implements MouseListener, MouseMotionListener {
        int x1, x2, y1, y2;
        int xDown, yDown, xNow, yNow;  // 逆方向にも対応させるためにpressした座標と現在座標を記憶

        private DrawByMouse() {
            setBackground((Color.white));
            setPreferredSize(new Dimension(500, 500));
            addMouseListener(this);
            addMouseMotionListener(this);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(colors[lineColBox.getSelectedIndex()]);  // 線の色を指定
            switch (shape) {
                case RECT:
                    g.drawRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                    g.setColor(colors[coverColBox.getSelectedIndex()]);  // 塗りつぶしの色を指定
                    g.fillRect(x1+1, y1+1, Math.abs(x2 - x1)-1, Math.abs(y2 - y1)-1);
                    break;
                case OVAL:
                    g.drawOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                    g.setColor(colors[coverColBox.getSelectedIndex()]);  // 塗りつぶしの色を指定
                    g.fillOval(x1+1, y1+1, Math.abs(x2 - x1)-2, Math.abs(y2 - y1)-2);
                    break;
                case LINE:
                    g.drawLine(xDown, yDown, xNow, yNow);
                    break;
                default:
                    break;
            }
        }

        @Override
        public void mouseDragged(MouseEvent e) { mouseReleased(e); }

        @Override
        public void mousePressed(MouseEvent e) {
            xDown = e.getX();
            yDown = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            xNow = e.getX();
            yNow = e.getY();

            // 逆方向も考慮した座標計算
            if (xNow - xDown > 0) { x1 = xDown; x2 = xNow;}
            else                  { x1 = xNow;  x2 = xDown; }

            if (yNow - yDown > 0) { y1 = yDown; y2 = yNow;}
            else                  { y1 = yNow; y2 = yDown; }

            repaint();
        }

        public void mouseMoved(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
}
