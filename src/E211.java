import javax.swing.*;
import java.awt.*;

public class E211 extends JPanel {
    public E211() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(250, 250));
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(50,50,200,200);
        g.drawLine(200,50,50,200);
        g.drawRect(50,50,150,150);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Draw Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E211 h = new E211();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}