import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int upper = 0, lower = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else {
                lower++;
            }
        }
        
        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}