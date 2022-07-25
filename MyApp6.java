public class MyApp6 {
    public static void main(String[] args) {
        // 演算 + - * / % ++ --
        int i = 10 / 3;
        System.out.println(i); // 3
        i = 10 % 3;
        System.out.println(i); // 1
        int x = 5;
        x++;
        System.out.println(x); // 6
        x--;
        System.out.println(x); // 5
        int y = 5;
        y += 12;
        System.out.println(y); // 17
        y *= 10;
        System.out.println(y); // 170
        
        // 文字列の結合
        String str = "hello " + "world";
        System.out.println(str); // hello world
        
        // データ型変換について
        double d = 52343.321;
        // int i2 = d; // コンパイル時に error
        int i2 = (int)d; // <- ちゃんと変換してあげる
        System.out.println(i2);
        // 「キャスト」　……　他のデータ型に変換すること 
        int i3 = 10;
        // double d3 = i3 / 4; // 2.0
        double d3 = (double)i3 / 4; // 2.5
        System.out.println(d3);
    }
}