// パッケージ名の記入
package com.dotinstall.myapp;
// import com.dotinstall.myapp.model.User;
// import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.*; // ワイルドカードでまとめて読み込める

public class MyApp22 {
    public static void main(String[] args) {
        User tom = new User("tom");
        // System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("bob");
        // System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}

// コンパイルは main メソッドを含むクラスのファイルをコンパイルすると芋づる式に自動実行される。
// なお、MyApp22.java のあるディレクトリではなく、com の上のディレクトリからコンパイルしないと import 元のパッケージファイルがコンパイルされない。
// 例：「javac -encoding UTF-8 com/dotinstall/myapp/MyApp22.java」

// 実行はトップのディレクトリからパッケージ名で指定する
// 例：「java com.dotinstall.myapp.MyApp22」
