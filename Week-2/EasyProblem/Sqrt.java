public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;
        long right = x;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid; 
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Sqrt sol = new Sqrt();

        System.out.println(sol.mySqrt(4)); 
        System.out.println(sol.mySqrt(8)); 
    }
}


