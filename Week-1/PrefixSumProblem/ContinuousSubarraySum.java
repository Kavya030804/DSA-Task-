import java.util.*;

    
public class ContinuousSubarraySum {
        public static boolean checkSubarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                int mod = sum % k;
                if (map.containsKey(mod)) {
                    if (i - map.get(mod) > 1) {
                        return true;
                    }
                } else {
                    map.put(mod, i);
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(checkSubarraySum(nums, k));
        }
    }
    