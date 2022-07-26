public class MyApp10 {
    public static void main(String[] args) {
        // while
        // 0 - 9
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        
        // do while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        
        // while は前判定、do while は後判定
        
        // for
        for (int k = 0; k < 10; k++) {
            if (k == 5) { continue; }
            if (k == 8) { break; }
            System.out.println(k); // 1 2 3 4 6 7
        }
    }
}