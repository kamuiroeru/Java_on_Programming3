import java.io.*;
import java.util.Scanner;

class FileReadWrite {
    void dataInOut() throws IOException {
        int c;
        FileReader filein = new FileReader("Hello.txt");
        FileWriter fileout = new FileWriter("Back.txt");

        while ((c = filein.read()) != -1) {
            fileout.write((char) c);
        }
        filein.close();
        fileout.close();
    }

    public static void main(String[] args) {
        FileReadWrite r = new FileReadWrite();
        try {
            r.dataInOut();
        } catch (IOException error) {
            System.out.println("IOエラー発生");
        }

    }
}

class FileReadWrite2 {
    void dataInOut() throws IOException {
        BufferedReader din = new BufferedReader(new FileReader("Hello.txt"));
        String s;
        while ((s = din.readLine()) != null) {
            System.out.println(s);
        }
        din.close();
    }

    public static void main(String[] args) {
        FileReadWrite2 r = new FileReadWrite2();
        try {
            r.dataInOut();
        } catch (IOException e) {
            System.out.println("IOエラー発生");
        }
    }
}

class ScanFile {
    void dataSum() throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("data.txt")));
        double sum = 0;
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
        }
        sc.close();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ScanFile r = new ScanFile();
        try{
            r.dataSum();
        }catch(IOException e){
            System.out.println("IOエラー発生");
        }
    }
}