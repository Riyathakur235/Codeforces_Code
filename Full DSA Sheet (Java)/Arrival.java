import java.util.*;

public class Arrival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int maxIndex = 0;
        int minIndex = 0;

        // Find max (leftmost) and min (rightmost)
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);

        // If max comes after min, one swap is saved
        if (maxIndex > minIndex) {
            swaps--;
        }

        System.out.println(swaps);
    }
}