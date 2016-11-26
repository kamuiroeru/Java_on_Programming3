import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

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
        List<String> Fonts = new ArrayList<>(Arrays.asList("IPAexMincho", "IPAexGothic", "Osaka", "ヒラギノ角ゴ StdN"));
        HashMap<String, Color> FontAndlightColor = new HashMap<>();
        FontAndlightColor.put("IPAexMincho", Color.green);
        FontAndlightColor.put("IPAexGothic", Color.yellow);
        FontAndlightColor.put("Osaka", Color.cyan);
        FontAndlightColor.put("ヒラギノ角ゴ StdN", Color.magenta);
        Collections.shuffle(darkColor); Collections.shuffle(Fonts);
        b1.setFont(new Font(Fonts.get(0),Font.PLAIN,20)); b1.setBackground(FontAndlightColor.get(Fonts.get(0)));
        b2.setFont(new Font(Fonts.get(0),Font.PLAIN,20)); b2.setBackground(FontAndlightColor.get(Fonts.get(0)));
        b3.setFont(new Font(Fonts.get(0),Font.PLAIN,20)); b3.setBackground(FontAndlightColor.get(Fonts.get(0)));
        t1.setFont(new Font(Fonts.get(1),Font.PLAIN,20)); t1.setBackground(FontAndlightColor.get(Fonts.get(1)));
        t2.setFont(new Font(Fonts.get(1),Font.PLAIN,20)); t2.setBackground(FontAndlightColor.get(Fonts.get(1)));
        ta.setFont(new Font(Fonts.get(1),Font.PLAIN,20)); ta.setBackground(FontAndlightColor.get(Fonts.get(1)));
        tb.setFont(new Font(Fonts.get(1),Font.PLAIN,20)); tb.setBackground(FontAndlightColor.get(Fonts.get(1)));
        b4.setFont(new Font(Fonts.get(2),Font.PLAIN,20)); b4.setBackground(FontAndlightColor.get(Fonts.get(2)));
        b5.setFont(new Font(Fonts.get(2),Font.PLAIN,20)); b5.setBackground(FontAndlightColor.get(Fonts.get(2)));
        b6.setFont(new Font(Fonts.get(3),Font.PLAIN,20)); b6.setBackground(FontAndlightColor.get(Fonts.get(3)));
        b7.setFont(new Font(Fonts.get(3),Font.PLAIN,20)); b7.setBackground(FontAndlightColor.get(Fonts.get(3)));
        b8.setFont(new Font(Fonts.get(3),Font.PLAIN,20)); b8.setBackground(FontAndlightColor.get(Fonts.get(3)));
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