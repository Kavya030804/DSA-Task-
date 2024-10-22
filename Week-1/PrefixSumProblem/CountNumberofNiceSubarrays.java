 
    
import java.util.*;

public class CountNumberofNiceSubarrays {
    public static int print(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        int count = 0, left = 0, res = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                k--;
            }
            while (k < 0) {
                if (nums[left] % 2 == 1) {
                    k++;
                }
                left++;
            }
            res += right - left + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(print(nums, k));
    }
}

