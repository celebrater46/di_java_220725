// final 修飾子はクラスにもメソッド（関数）にもフィールド（変数）にも使うことができて、「変更ができない」という意味

// class User {
final class User { // クラスに final をつけると継承ができない
    protected String name; // AdminUser でも使うので protected
    private static final double VERSION = 1.1; // フィールドに final がつくと定数になる。必ず最初に初期化。なお、定数は全部大文字で書くことが多い。
    // 定数の時に static と final があわせて使われるのは、どうせ値が変わらないなら、インスタンスを変数にしておいてインスタンスごとに値を持たせるよりも static をつけて1つだけのクラス変数にしてしまえばいい、という考え方。

    public User(String name) {
        this.name = name;
        User.VERSION = 1.2; // MyApp27.java:10: error: cannot assign a value to final variable VERSION
    }

    // public void sayHi() {
    public final void sayHi() { // メソッドに final がつくと、オーバーライドできない
        System.out.println("hi! " + this.name);
    }
}

class AdminUser extends User { // MyApp27.java:19: error: cannot inherit from final User
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void sayHi() { // MyApp27.java:25: error: sayHi() in AdminUser cannot override sayHi() in User
        System.out.println("[admin] hi! " + this.name);
    }
}

public class MyApp27 {
    public static void main(String[] args) {
        User tom = new User("tom");
    }
}