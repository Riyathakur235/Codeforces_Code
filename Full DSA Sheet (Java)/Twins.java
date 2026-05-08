import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] a = new Integer[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        // Sort in descending order
        Arrays.sort(a, Collections.reverseOrder());

        int mySum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            mySum += a[i];
            count++;

            if (mySum > totalSum - mySum) {
                break;
            }
        }

        System.out.println(count);
    }
}