import java.util.*;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long x = sc.nextLong();
        
        int count = 0;
        
        for (long i = 1; i <= n; i++) {
            if (x % i == 0) {          // i divides x
                long j = x / i;
                if (j <= n) {         // j is within table
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}

