// 列挙型

// enum hoge
enum Result { // Result 型の生成
    SUCCESS, // 0
    ERROR, // 1
    // 列挙型を定義すると ordinal() という特殊なメソッドも定義され、0 からはじまる連番がセットされる
}

public class MyApp30 {
    public static void main(String[] args) {
        Result res; // Result 型なので、「SUCCESS」か「ERROR」
        // System.out.println();
        res = Result.ERROR; // 処理がうまくいかなかった時
        switch(res) {
            case SUCCESS:
                System.out.println("success!");
                System.out.println(res.ordinal()); // 0
                break;
            case ERROR:
                System.out.println("error!");
                System.out.println(res.ordinal()); // 1
                break;
        }
    }
}

// 列挙型は内部的には特殊なクラスとして扱われており、中にフィールドやメソッドを持つこともできる