// インターフェース

// interface hoge {}
interface Printable {
    // 定数、抽象メソッド、defaultメソッド、staticメソッドが使用できる
    double VERSION = 1.2; // 定数。public static final は省略できる
    void print(); // 抽象メソッド。public abstract は省略できる
    public default void getInfo() { // default メソッド
        System.out.println("I/F ver. " + Printable.VERSION);
    }
    // static メソッドの主な使い道は default メソッドが複雑になってきた時に処理をまとめるというヘルパー的な使い方がある
}

// class User {
class User implements Printable { // インターフェースの使用
    @Override // 抽象メソッドのオーバーライド
    public void print() {
        System.out.println("Now printing user profile...");
    }
}

public class MyApp29 {
    public static void main(String[] args) {
        User tom = new User();
        tom.print();
        tom.getInfo();
    }
}

// インターフェースはクラスの継承と違い、いくつでもクラスに適用させることができるので、かなり柔軟にクラスを拡張できる
