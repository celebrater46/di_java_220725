public class MyApp8 {
    public static void main(String[] args) {
        // if
        // > >= < <= == !=
        // && || !
        int score = 85;
        if(score > 80) {
            System.out.println("Great!");
        } else if(score > 60) {
            System.out.println("Good!");
        } else {
            System.out.println("Bad!");
        }
        
        // 条件演算子
        String msg = score > 80 ? "Great!" : "Bad!";
        System.out.println(msg);
        
        // switch
        String signal = "red";
        switch(signal) {
            case "red":
                System.out.println("stop!");
                break;
            case "blue":
            case "green":
                System.out.println("go!");
                break;
            case "yellow":
                System.out.println("caution!");
                break;
            default:
                System.out.println("wrong signal!");
                break;
        }
    }
}