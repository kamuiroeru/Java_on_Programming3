import javax.swing.*;
import java.awt.*;

public class E192 extends JPanel {
    JLabel label;
    JButton b1, b2;

    public E192() {
        label = new JLabel("こんにちは");
        b1 = new JButton("ボタン1");
        b2 = new JButton("ボタン2");
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        JPanel flowPanel = new JPanel();
        flowPanel.add(b1);
        flowPanel.add(b2);
        add(flowPanel, BorderLayout.CENTER);
//        add(b1, BorderLayout.CENTER);     17~20行目を追加
//        add(b2, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E192 h = new E192();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }


}
