public class FindaPeakElement2nd {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) maxRow = i;
            }
            boolean isLeftSmaller = mid == 0 || mat[maxRow][mid] > mat[maxRow][mid - 1];
            boolean isRightSmaller = mid == n - 1 || mat[maxRow][mid] > mat[maxRow][mid + 1];
            if (isLeftSmaller && isRightSmaller) return new int[]{maxRow, mid};
            else if (!isLeftSmaller) right = mid - 1;
            else left = mid + 1;
        }
        return new int[]{-1, -1};
    }
}

