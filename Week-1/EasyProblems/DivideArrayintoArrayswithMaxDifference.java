import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivideArrayintoArrayswithMaxDifference  {
    public static List<List<Integer>> divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            if (list.size() < 3) {
                if (list.isEmpty() || num - list.get(0) <= k) {
                    list.add(num);
                }
            }
            if (list.size() == 3) {
                res.add(new ArrayList<>(list));
                list.clear();
            }
        }

        if (res.size() != nums.length / 3) {
            return new ArrayList<>();
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

    
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        List<List<Integer>> res = divideArray(nums, k);

        
        if (res.isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.println("Resulting 2D array:");
            for (List<Integer> group : res) {
                System.out.println(group);
            }
        }

        sc.close();
    }
}

