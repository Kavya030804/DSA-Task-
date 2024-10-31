import java.util.Scanner;

public class MinimumSpeedToArriveOnTime {
    public static int minSpeedOnTime(int[] dist, double hour) {
        int left = 1, right = 10000000;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canReachOnTime(dist, hour, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static boolean canReachOnTime(int[] dist, double hour, int speed) {
        double time = 0;
        for (int i = 0; i < dist.length; i++) {
            double travelTime = (double) dist[i] / speed;
            time += (i == dist.length - 1) ? travelTime : Math.ceil(travelTime);
            if (time > hour) return false;
        }
        return time <= hour;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) dist[i] = sc.nextInt();
        double hour = sc.nextDouble();
        System.out.println(minSpeedOnTime(dist, hour));
        sc.close();
    }
}

