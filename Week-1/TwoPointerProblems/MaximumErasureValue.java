 
import java.util.*;


public class MaximumErasureValue {
    public static int print(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int left = 0, sum = 0, ans = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(print(nums));
    }
}

