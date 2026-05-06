import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i]; // copy
        }

        // sort copy
        Arrays.sort(b);

        int l = 0, r = n - 1;

        // find first mismatch
        while (l < n && a[l] == b[l]) {
            l++;
        }

        // find last mismatch
        while (r >= 0 && a[r] == b[r]) {
            r--;
        }

        // reverse the segment [l, r]
        reverse(a, l, r);

        // check if sorted now
        boolean sorted = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("yes");
            // +1 because problem uses 1-based indexing
            System.out.println((l + 1) + " " + (r + 1));
        } else {
            System.out.println("no");
        }
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
    

