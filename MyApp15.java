public class MyApp15 {
    public static void main(String[] args) {
        // データ型と参照型の違い
        int x = 10;
        int y = x;
        y = 5;
        System.out.println(x); // 10
        System.out.println(y); // 5
        
        int[] a = {5, 10, 15};
        int[] b = a;
        b[1] = 5; // b[1] を変更すると、紐付けられている a[1] も変更される！
        System.out.println(a[1]); // 5
        System.out.println(b[1]); // 5
        
        String s = "hello";
        String t = s;
        t = "world";
        System.out.println(s); // hello
        System.out.println(t); // world
        // String は参照型だが、元のデータが保持される仕様
        // 文字列は基本的に変更が不可で、違う文字列を割り当てると別の領域に新しくデータを確保する
    }
}