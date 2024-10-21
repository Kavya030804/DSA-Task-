
    
import java.util.Scanner;

public class LemonadeChange {
    public static boolean canProvideChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();
        
        int[] bills = new int[n];
        System.out.println("Enter the bills: ");
        for (int i = 0; i < n; i++) {
            bills[i] = sc.nextInt();
        }

        boolean res = canProvideChange(bills);
        System.out.println(res);

        sc.close();
    }
}

