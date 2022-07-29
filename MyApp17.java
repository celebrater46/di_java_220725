public class MyApp17 {
    // メソッドのオーバーロード
    public static void sayHi(String name) {
        int x = 10;
        System.out.println("Hi! " + name);
        // 変数 x, name はこのスコープ内でのみ有効
    }
    
    // overload 引数がない時にはこちらが呼び出される
    public static void sayHi() {
        // int x = 10;
        System.out.println("Hi! NoName!");
        // 変数 x, name はこのスコープ内でのみ有効
    }
    
    
    public static void main(String[] args) {
        sayHi(); // NoName
        sayHi("Tiki"); // Tiki
        // System.out.println(name); // error
        // System.out.println(x); // error
        
    }
}