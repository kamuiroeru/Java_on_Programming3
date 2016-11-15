import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class H191 extends JPanel {
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JCheckBox t1, t2, ta, tb;

    public H191(){
        b1 = new JButton("ボタン1"); b1.setOpaque(true);
        b2 = new JButton("ボタン2"); b2.setOpaque(true);
        b3 = new JButton("ボタン3"); b3.setOpaque(true);
        b4 = new JButton("ボタン4"); b4.setOpaque(true);
        b5 = new JButton("ボタン5"); b5.setOpaque(true);
        b6 = new JButton("ボタン6"); b6.setOpaque(true);
        b7 = new JButton("ボタン7"); b7.setOpaque(true);
        b8 = new JButton("ボタン8"); b8.setOpaque(true);
        t1 = new JCheckBox("チェック1"); t1.setOpaque(true);
        t2 = new JCheckBox("チェック2"); t2.setOpaque(true);
        ta = new JCheckBox("チェックA"); ta.setOpaque(true);
        tb = new JCheckBox("チェックB"); tb.setOpaque(true);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p1_1 = new JPanel(); p1_1.setOpaque(true);
        JPanel p1_2 = new JPanel(); p1_2.setOpaque(true);
        JPanel p2_1 = new JPanel(); p2_1.setOpaque(true);
        JPanel p2_2 = new JPanel(); p2_2.setOpaque(true);
        p1_1.add(b1); p1_1.add(b2); p1_1.add(b3);
        p1_2.add(t1); p1_2.add(t2); p1_2.add(ta); p1_2.add(tb);
        p2_1.add(b4); p2_1.add(b5);
        p2_2.add(b6); p2_2.add(b7); p2_2.add(b8);
        p1.add(p1_1); p1.add(p1_2);
        p2.add(p2_1); p2.add(p2_2);
        p1.setLayout(new GridLayout(0,1));
        p2.setLayout(new GridLayout(0,1));
        p1_1.setLayout(new FlowLayout());
        p1_2.setLayout(new GridLayout(2,0));
        p2_1.setLayout(new GridLayout(0,1));
        p2_2.setLayout(new FlowLayout());
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        List<Color> darkColor = new ArrayList<>(Arrays.asList(Color.black, Color.red, Color.darkGray, Color.blue));
        List<Color> lightColor = new ArrayList<>(Arrays.asList(Color.green, Color.yellow, Color.cyan, Color.magenta));
        Collections.shuffle(darkColor); Collections.shuffle(lightColor);
        b1.setBackground(lightColor.get(0));
        b2.setBackground(lightColor.get(0));
        b3.setBackground(lightColor.get(0));
        t1.setBackground(lightColor.get(1));
        t2.setBackground(lightColor.get(1));
        ta.setBackground(lightColor.get(1));
        tb.setBackground(lightColor.get(1));
        b4.setBackground(lightColor.get(2));
        b5.setBackground(lightColor.get(2));
        b6.setBackground(lightColor.get(3));
        b7.setBackground(lightColor.get(3));
        b8.setBackground(lightColor.get(3));
        p1_1.setBackground(darkColor.get(0));
        p1_2.setBackground(darkColor.get(1));
        p2_1.setBackground(darkColor.get(2));
        p2_2.setBackground(darkColor.get(3));

        this.add(p1); this.add(p2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H191 h = new H191();
        frame.add(h, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}