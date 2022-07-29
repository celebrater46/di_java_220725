class User {
    String name;

    User(String name) {
        this.name = name;
    }

    void sayHi() {
        System.out.println("hi! " + this.name);
    }
}

class AdminUser extends User {
    // コンストラクタ（名前を渡すことを想定）
    AdminUser(String name) {
        super(name); // 親クラスのコンストラクタを呼ぶ
    }

    void sayHello() {
        System.out.println("hello! " + this.name);
    }

    // オーバーライド（親クラスのメソッドを上書きできる）
    @Override // アノテーション。オーバーライドを明示的に示し、メソッド名や引数を間違えた際にエラーにしてくれる
    void sayHi() {
        System.out.println("[admin] hi! " + this.name);
    }
}

public class MyApp20 {
    public static void main(String[] args) {
        // User tom;
        // tom = new User("tom");
        User tom = new User("tom");
        System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("bob");
        System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}

/*
▼パッケージについて
　関連するクラスをまとめたり、名前の衝突を避けることができる。
　他の人とかぶらないようにするために、組織のドメインを逆にしたものを使うことが多い。
　パッケージのトップレベルにあるクラスに関しては、アクセス修飾子「public」か、もしくは何も付けないという指定ができる。
　Top Level - public, (package private)
　Field, methods - public, (package private), private, protected
　アプリの起点となるクラスは main() のあるクラスで、これは必ず「public」に指定しなければならない。
_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
com.dotinstall.myapp {
    public class MyApp { // main() のあるアプリの起点となるクラスは public
        public main() { // メインメソッドは必ず public
            System.out.println("Hello World.");
        }
    }
}

com.dotinstall.model {
    public class User {
        String name = "Hideru";

        // private name() { // private 変数は同じクラスのみからのアクセス
        protected name() { // private 変数は同じパッケージか、子クラスのみからのアクセス
            System.out.println("Hi, " + name);
        }

        public void sayHi() {
            System.out.println("hello! " + name);
        }
    }

    public class AdminUser {
        AdminUser(String name) {
            super(name);
        }

        public void sayHello() {
            System.out.println("hello! " + this.name);
        }

        @Override
        public void sayHi() {
            System.out.println("[admin] hi! " + this.name);
        }

    }
}
_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
*/