import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Ex1 {
    void printResult() throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("seiseki.txt")));
        int total = 0;
        ArrayList<Integer> scoreArr = new ArrayList<Integer>();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                System.out.println(x);
                total += x;
                scoreArr.add(x);
            } else {
                System.out.print(sc.next() + "\t");
            }
        }
        System.out.println("合計\t" + String.valueOf(total));
        for (int x : scoreArr) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex1 r = new Ex1();
        try {
            r.printResult();
        } catch (IOException e) {
            System.out.println("IOエラー発生");
        }
    }
}