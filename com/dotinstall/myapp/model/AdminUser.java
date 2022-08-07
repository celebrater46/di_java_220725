// パッケージ名の記入
package com.dotinstall.myapp.model;

public class AdminUser extends User {
    // AdminUser(String name) {
    public AdminUser(String name) {
        super(name); // 親クラスのコンストラクタを呼ぶ
    }

    public void sayHello() {
        System.out.println("hello! " + this.name);
    }

    @Override
    public void sayHi() {
        System.out.println("[admin] hi! " + this.name);
    }
}