import java.util.Arrays;
import java.util.Scanner;

public class BuyTwoChocolates {
    public int buy(int[] prices, int money) {
        Arrays.sort(prices);
        int minSum = prices[0] + prices[1];

        if (minSum <= money) {
            return money - minSum;
        }

        return money;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter amount : ");
        int money = sc.nextInt();

        BuyTwoChocolates bc = new BuyTwoChocolates();
        int leftover = bc.buy(prices, money);
        System.out.println("Leftover money: " + leftover);

        sc.close();
    }
}
