import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        int mid = n / 2;

        while (k > 0) {
            long currentMedian = a[mid];

            int count = 0;

            // count elements equal to median from mid onward
            for (int i = mid; i < n; i++) {
                if (a[i] == currentMedian) {
                    count++;
                } else {
                    break;
                }
            }

            // if we have enough operations to increase all
            if (k >= count) {
                for (int i = mid; i < mid + count; i++) {
                    a[i]++;
                }
                k -= count;
            } else {
                break;
            }
        }

        System.out.println(a[mid]);
    }
}