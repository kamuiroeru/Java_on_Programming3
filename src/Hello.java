import javax.swing.*;
import java.awt.*;

/**
 * Created by rokumura on 2016/10/18.
 */
public class Hello extends JPanel{
    JLabel label;
    JButton b1, b2;

    public Hello(){
        label = new JLabel("こんにちは");
        b1 = new JButton("ボタン1");
        b2 = new JButton("ボタン2");
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hello h = new Hello();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
