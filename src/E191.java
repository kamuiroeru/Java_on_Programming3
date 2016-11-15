import javax.swing.*;
import java.awt.*;

public class E191 extends JPanel {
    JLabel label;
    JButton b1, b2;

    public E191() {
        label = new JLabel("こんにちは");
        b1 = new JButton("ボタン1");
        b2 = new JButton("ボタン2");
        setLayout(new FlowLayout());    //BorderLayoutからFlowLayoutに変更
        add(label, BorderLayout.NORTH);
        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E191 h = new E191();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }


}
