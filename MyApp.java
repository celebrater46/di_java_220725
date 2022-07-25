public class MyApp {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // 変数「型 変数名」

        // String msg;
        // msg = "Hello World from var msg.";
        // String msg = "Hello World from var msg again!";
        // System.out.println(msg);

        // 一文字の場合は char 型
        char a = 'a';

        // 整数型 byte short int long（右に行くほど桁の大きな数、通常は int ?）
        int x = 10;
        long y = 99999999999999999L; // 最後に「L」が要る。小文字だと1と間違えるので、大文字で。

        // 浮動小数点数 float double（double の方が一般的で、大きな桁を扱える）
        double d = 23423.344;
        float f = 32.33F;

        // 論理値
        boolean flag = true; // true or false

        // 特殊文字 \n（改行）、\t（TAB）
        String msg = "Hello Wo\nrld from var msg again\tagain!";
//        string msg2 = "Hello again."; // Error
        String msg2 = "Hello again."; // Error
        System.out.println(msg);
        System.out.println(msg2);

        // 日本語を含むコンパイルは　
        // javac -encoding UTF-8 MyApp.java
        // などと文字コードを指定する必要あり
        // 実行は java MyApp でよい
    }
}