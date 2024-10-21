 
    
 import java.util.HashMap;
 import java.util.Scanner;
 
 public class CountElementswithMaximumFrequency  {
     public static int find(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
 
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
 
        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
 
        int totalCount = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                totalCount += freq;
            }
        }
 
        return totalCount;
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
 
        int res = find(nums);
        System.out.println("Total frequency: " + res);
 
        sc.close();
    }
 }
 
