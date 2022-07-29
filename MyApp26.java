// static イニシャライザ

class User {
    private String name;
    // private static int count = 0; // クラス変数
    private static int count; // イニシャライザを使うことで、クラス変数が配列だったり複数のデータをセットしたりするような複雑な処理をする場合に便利。

    // イニシャライザ
    static {
        // ここにクラスが初期化される際に行う処理を書く
        User.count = 0;
        System.out.println("Static initializer");
    }
    
    // インスタンス・イニシャライザ
    {
        // ここにインスタンスが初期化される際に行う処理を書く
        // コンストラクタはインスタンス化された後、イニシャライザはインスタンス化される前
        // 主な使い道は、コンストラクタがオーバーロードされていて複数あった場合、共通処理をこちらに書いておいて先に実行したり。
        System.out.println("Instance initializer");
    }
    
    public User(String name) {
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }

    public static void getInfo() {
        System.out.println("# of instances");
    }
}

public class MyApp26 {
    public static void main(String[] args) {
        User.getInfo(); // 0
        User tom = new User("tom");
        User.getInfo(); // 1
        User bob = new User("bob");
        User.getInfo(); // 2
    }
}

// Static initializer
// # of instances
// Instance initializer
// Constructor
// # of instances
// Instance initializer
// Constructor
// # of instances