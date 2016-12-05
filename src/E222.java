import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E222 extends JPanel implements ActionListener {
    private JLabel label;
    private JPanel panel;
    private JButton bGoo, bTyo, bPer;

    private E222() {
        panel = new JPanel(); //中央揃えするためにパネル配置
        label = new JLabel("じゃんけん");
        bGoo = new JButton("グー");
        bTyo = new JButton("チョキ");
        bPer = new JButton("パー");

        bGoo.addActionListener(this);
        bTyo.addActionListener(this);
        bPer.addActionListener(this);

        setLayout(new BorderLayout());
        add(bGoo, BorderLayout.EAST);
        add(bTyo, BorderLayout.CENTER);
        add(bPer, BorderLayout.WEST);
        add(panel, BorderLayout.SOUTH); //南にパネル配置
        panel.add(label, BorderLayout.CENTER); //パネルの中で中央に
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == bGoo) label.setText("あなたの" + rsp(0));
        if (obj == bTyo) label.setText("あなたの" + rsp(1));
        if (obj == bPer) label.setText("あなたの" + rsp(2));
    }

    private String rsp(int x) {
        double h = Math.random();
        int hand = 0;
        if (h * 3 < 1) {
            hand = 0;
        } else if (h * 3 >= 1 && h * 3 < 2) {
            hand = 1;
        } else if (h * 3 >= 2) {
            hand = 2;
        }
        String s = null;
        switch (Math.abs(x - hand)) {
            case 0:
                s = "あいこ";
                break;
            case 1:
                s = "勝ち";
                break;
            case 2:
                s = "負け";
                break;
        }
        return s;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E222 h = new E222();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}