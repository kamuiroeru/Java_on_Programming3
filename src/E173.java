import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class E173 {
    void dataOut(String args) throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("data1.txt")));
        FileWriter fileout = new FileWriter(args);
        while (sc.hasNext()) {
            fileout.write(sc.next() + "\n");
        }
        fileout.close();
    }

    public static void main(String[] args) {
        E173 r = new E173();
        try {
            r.dataOut(args[0]);
        } catch (IOException error) {
            System.out.println("IOエラー発生");
        }
    }
}