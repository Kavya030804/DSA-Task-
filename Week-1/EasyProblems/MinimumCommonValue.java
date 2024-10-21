import java.util.Scanner;

public class MinimumCommonValue  {
    public static int find(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the elements of nums2: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int res = find(nums1, nums2);
        System.out.println(res);

        sc.close();
    }
}

