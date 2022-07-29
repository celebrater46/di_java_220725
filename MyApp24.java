class User {
    private String name; // 不用意に外部からアクセスされないように基本的には private
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // getter
    public int getScore() { // 慣習的に get にフィールド名をつけたメソッド名にすることが多い
        return this.score;
    }

    // setter
    public void setScore(int score) {
        if(score > 0) { // マイナスの値は無視しろ
            this.score = score;
        }
    }
}

public class MyApp24 {
    public static void main(String[] args) {
        User tom = new User("tom", 65);
        tom.setScore(85);
        tom.setScore(-22);
        System.out.println(tom.getScore());
    }
}

// Java では1つのソースファイルにつき1つの public クラスしか持てない
// name に関しては getter だけ設定し、読み取り専用、というふうにもできる
// フィールドに関しては基本的に private にしつつ、getter, setter できめ細かいアクセス管理をすることがよくある