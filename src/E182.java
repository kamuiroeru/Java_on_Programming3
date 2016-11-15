import javax.swing.*;
import java.awt.*;

public class E182 extends JPanel {
    JButton b1, b2, b3, b4, b5;

    public E182() {
        b1 = new JButton("北");
        b2 = new JButton("西");
        b3 = new JButton("中央");
        b4 = new JButton("東");
        b5 = new JButton("南");
        setLayout(new BorderLayout());
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.CENTER);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E182 h = new E182();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
