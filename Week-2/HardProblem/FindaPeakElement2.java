import java.util.Scanner;

class FindaPeakElement2 {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int midCol = left + (right - left) / 2;
            int maxRow = 0;
            
            for (int i = 0; i < m; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }
            
            if ((midCol == 0 || mat[maxRow][midCol] > mat[maxRow][midCol - 1]) &&
                (midCol == n - 1 || mat[maxRow][midCol] > mat[maxRow][midCol + 1])) {
                return new int[] {maxRow, midCol};
            }
            
            if (midCol > 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol]) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }
        
        return new int[] {-1, -1};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        FindaPeakElement2 sol = new FindaPeakElement2();
        int[] peak = sol.findPeakGrid(mat);
        System.out.println("[" + peak[0] + ", " + peak[1] + "]");
    }
}
