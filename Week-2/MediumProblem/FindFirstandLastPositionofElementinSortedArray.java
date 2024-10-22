import java.util.Scanner;

public class FindFirstandLastPositionofElementinSortedArray {
    public static int[] search(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = print(nums, target);
        result[1] = print(nums, target);
        return result;
    }

    private static int print(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) high = mid - 1;
            else low = mid + 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private static int find(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) low = mid + 1;
            else high = mid - 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();
        int[] res = search(nums, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
        sc.close();
    }
}

