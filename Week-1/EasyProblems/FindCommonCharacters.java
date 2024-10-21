
   
import java.util.*;

public class FindCommonCharacters {
    public static List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine();  

     
        String[] words = new String[n];
        System.out.println("Enter the words: ");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        List<String> res = commonChars(words);
        System.out.println("Common characters: " + res);

        sc.close();
    }
}
