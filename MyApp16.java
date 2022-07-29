public class MyApp16 {
    // メソッド

    // public static void sayHi() {
    // public static void sayHi(String name) { // 引数に型指定が要る
    public static String sayHi(String name) { // return を返す場合は関数名の前に型指定（void は戻り値なしという意味）。
        // System.out.println("Hi!");
        // System.out.println("Hi! " + name);
        return "Hi! " + name;
    }

    public static void main(String[] args) {
        // sayHi();
        // sayHi("Miyon");
        // sayHi("Sally");
        String msg = sayHi("Ophelia");
        System.out.println(msg);
    }
}