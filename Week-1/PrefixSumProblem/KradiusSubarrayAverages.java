import java.util.Scanner;

public class KradiusSubarrayAverages {
    public static int[] print(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        long sum = 0;
        int windowSize = 2 * k + 1;
        
        for (int i = 0; i < n; i++) {
            avgs[i] = -1;
        }

        if (n < windowSize) {
            return avgs;
        }

        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        avgs[k] = (int) (sum / windowSize);

        for (int i = k + 1; i < n - k; i++) {
            sum += nums[i + k] - nums[i - k - 1];
            avgs[i] = (int) (sum / windowSize);
        }

        return avgs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = print(nums, k);
        for (int avg : res) {
            System.out.print(avg + " ");
        }
    }
}

