import javax.swing.*;
import java.awt.*;

public class E183 extends JPanel {
    JLabel label;
    JButton b1, b2;
    ImageIcon p1, p2;

    public E183() {
        label = new JLabel("こんにちは");
        p1 = new ImageIcon("West.png");
        p2 = new ImageIcon("East.jpg");
        b1 = new JButton(p1);
        b2 = new JButton(p2);
        setLayout(new BorderLayout());
        add(b1, BorderLayout.WEST);
        add(b2, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E183 h = new E183();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
