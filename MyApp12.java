public class MyApp12 {
    public static void main(String[] args) {
        // 配列
        int[] sales;
        sales = new int[3]; // sales[0], sales[1], sales[2]が生成される
        sales[0] = 100;
        sales[1] = 200;
        sales[2] = 300;

        System.out.println(sales[1]); // 200
        sales[1] = 1000;
        System.out.println(sales[1]); // 1000
        
        // 一気に書くこともできる
        int[] prices;
        prices = new int[] {10, 20, 30};
        
        System.out.println(prices[1]); // 20
        prices[1] = 10000;
        System.out.println(prices[1]); // 10000
        
        // 配列の要素を操作
        int[] nums = {145, 468, 689}; // <- new しなくてもいけるくさい
        // for (int i = 0; i < 3; i++) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int num : nums) { // より短い書き方
            System.out.println(num);
        }
    }
}