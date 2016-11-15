/**
 * Created by 嶺 on 2016/10/11.
 */
public class E164 {
    public static void main(String[] args) {
        try {
            System.out.println("割り算結果は " + String.valueOf(division(args[0], args[1])) + "です。");
        } catch (NumberFormatException e) {
            System.out.println("数値に変換可能な値を2つ入力してください");
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println("0で割ることはできません");
            System.exit(1);
        }
    }

    static int division(String arg1, String arg2) throws NumberFormatException, ArithmeticException {
        int x = Integer.parseInt(arg1), y = Integer.parseInt(arg2);
        return x / y;
    }
}


