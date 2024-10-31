import java.util.Scanner;

public class KokoEatingBananas {
    public static int find(int[] piles, int h) {
        int left = 1, right = getMax(piles);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    private static int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) max = Math.max(max, pile);
        return max;
    }

    private static boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) hours += (pile + k - 1) / k;
        return hours <= h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) piles[i] = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(find(piles, h));
        sc.close();
    }
}

