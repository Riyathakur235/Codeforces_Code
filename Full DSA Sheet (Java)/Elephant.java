import java.util.*;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //  Find minimum value
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        //  Count occurrences of minimum
        int count = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                count++;
                index = i + 1; // 1-based index
            }
        }

        //  Print result
        if (count > 1) {
            System.out.println("Still Rozdil");
        } else {
            System.out.println(index);
        }
    }
}

