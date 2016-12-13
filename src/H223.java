import javax.swing.*;
import java.awt.*;

public class H223 extends JPanel {
    JLabel label1, label2,  plus, minus, times, divid, surplus;
    JTextField from, to;

    private H223(){
        label1 = new JLabel("２つの整数をいれなさい");
        label2 = new JLabel("データを入れるたびにENTERを押してください");
        label1.setFont(new Font("MS Gothic", Font.PLAIN, 20));
        label2.setFont(new Font("MS Gothic", Font.PLAIN, 20));
        from = new JTextField("200");
        to = new JTextField("15");
        from.setPreferredSize(new Dimension(100, 20));
        to.setPreferredSize(new Dimension(100, 20));
        plus = new JLabel("加算 215");
        minus = new JLabel(" 減算 185");
        times = new JLabel("乗算 3000");
        divid = new JLabel(" 除算 13");
        surplus = new JLabel(" 剰余 5");
        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel0.add(from); panel0.add(to);
        panel1.add(plus); panel1.add(minus);
        panel2.add(times); panel2.add(divid); panel2.add(surplus);
        setLayout(new GridLayout(0, 1));
        add(label1); add(label2); add(panel0); add(panel1); add(panel2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H223 h = new H223();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}