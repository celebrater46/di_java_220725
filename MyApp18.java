// クラスについて
class User { // クラス名の最初の文字は大文字！
    String name = "Me!"; // クラスに属する変数は「フィールド」と呼ぶ

    void sayHi() {
        System.out.println("hi!");
    }

}

public class MyApp18 {
    public static void main(String[] args) {
        // int x;
        // String s;

        // Class
        User tom;
        tom = new User(); // インスタンス
        System.out.println(tom.name);
        tom.sayHi();
    }
}