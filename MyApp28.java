// 抽象クラス
// 他のクラスに継承されることを前提としており、「インスタンス化できない」。
// 抽象クラスを継承するクラスは「具象クラス」と呼ぶ。

// class User {
abstract class User { // abstract == 抽象クラス
    public abstract void sayHi(); // 抽象メソッド。具象クラスに実装を任せる。abstract をつけることで、実装されなかった場合にエラーを吐く。
}

class JapaneseUser extends User {
    @Override
    public void sayHi() {
        System.out.println("こんにちは！");
    }
}

class AmericanUser extends User {
    @Override
    public void sayHi() {
        System.out.println("Hi!");
    }
}

public class MyApp28 {
    public static void main(String[] args) {
        // System.out.println("hi!");
        AmericanUser tom = new AmericanUser();
        JapaneseUser hideru = new JapaneseUser();
        tom.sayHi();
        hideru.sayHi();
    }
}

// 日本語が「???????」などと表示される場合、「java -Dfile.encoding=UTF-8 MyApp28」というように文字コードを指定して実行する必要あり。