import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E221 extends JPanel implements ActionListener{
    JLabel label;
    JButton b1, b2;

    public E221(){
        label = new JLabel(" ");
        b1 = new JButton("ごあいさつ");
        b2 = new JButton("消去");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(b1,BorderLayout.CENTER);
        add(b2,BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == b1) label.setText("こんにちは");
        if(obj == b2) label.setText("");
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E221 h = new E221();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}