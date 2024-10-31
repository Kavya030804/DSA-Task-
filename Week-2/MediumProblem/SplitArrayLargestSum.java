import java.util.Scanner;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        int left = getMax(nums), right = getSum(nums);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    private static int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) max = Math.max(max, num);
        return max;
    }

    private static int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }

    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1, sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) {
                count++;
                sum = num;
                if (count > k) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(splitArray(nums, k));
        sc.close();
    }
}

