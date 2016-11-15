/**
 * Created by 嶺 on 2016/10/11.
 */
public class E162 {
    public static void main(String[] args) {
        System.out.println("割り算結果は " + String.valueOf(division(args[0], args[1])) + "です。");
    }

    static int division(String arg1, String arg2) {
        int x = 0, y = 0;
        try {
            x = Integer.parseInt(arg1);
            y = Integer.parseInt(arg2);
        } catch (NumberFormatException e) {
            System.out.println("数値に変換可能な値を2つ入力してください");
            System.exit(1);
        }
        try{
            return x / y;
        } catch (ArithmeticException e){
            System.out.println("0で割ることはできません");
            System.exit(1);
            return 0;
        }
    }
}