import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class H223 extends JPanel implements KeyListener {
    private JLabel plus, minus, times, divid, surplus;
    private JTextField from, to;

    private H223(){
        JLabel label1 = new JLabel("２つの整数をいれなさい");
        JLabel label2 = new JLabel("データを入れるたびにENTERを押してください");
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
        from.addKeyListener(this);
        to.addKeyListener(this);
    }

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if (keycode == KeyEvent.VK_ENTER) {
            int x = Integer.parseInt(from.getText());
            int y = Integer.parseInt(to.getText());
            plus.setText("加算 " + (x + y));
            minus.setText("減算 " + (x - y));
            times.setText("乗算 " + (x * y));
            divid.setText("除算 " + (x / y));
            surplus.setText("剰余 " + (x % y));
        }
    }
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H223 h = new H223();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}