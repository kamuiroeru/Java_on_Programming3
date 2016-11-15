import javax.swing.*;
import java.awt.*;

public class E194 extends JPanel {
    JLabel label;
    JButton b1, b2;

    public E194() {
        label = new JLabel("こんにちは");
        b1 = new JButton("ボタン1");
        b2 = new JButton("ボタン2");
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));    //BorderLayoutからFlowLayoutに変更
        add(label, BorderLayout.NORTH);
        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E194 h = new E194();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }


}
