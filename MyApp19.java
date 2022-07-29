// コンストラクタについて
class User {
    // String name = "Me!";
    String name;

    // constructor
    // Java のコンストラクタは、自クラスと同名にする
    User(String name) {
        this.name = name; // クラスの name フィールドがインスタンス化された際に渡ってくる Tom が設定される
    }

    // 引数なしの場合のオーバーロード
    User() {
        // this.name = "Me!";
        this("Me!"); // 引数なしでインスタンス化した場合に、引数が1つの「User(String name) {} のコンストラクタを呼ぶので、結果的に「 this.name = "Me!"」となる。 
    }

    void sayHi() {
        System.out.println("hi! " + this.name);
    }

}

public class MyApp19 {
    public static void main(String[] args) {
        // int x;
        // String s;

        // Class
        User tom;
        // tom = new User("Tom"); // インスタンス
        tom = new User(); // インスタンス
        System.out.println(tom.name);
        tom.sayHi();
    }
}