import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int child = 0; 
        int cookie = 0; 

        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }

        return child;
    }

    public static void main(String[] args) {
        AssignCookies ac = new AssignCookies();
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(ac.findContentChildren(g1, s1)); 

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(ac.findContentChildren(g2, s2));
    }
}
