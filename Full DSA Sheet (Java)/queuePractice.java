import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuePractice {
    public static void main(String[] args) {
      //  Queue<Integer>q=new LinkedList<>();
       // Queue<Integer>q1=new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        System.out.println(q);
//        int k=4;
//        Stack<Integer>st= new Stack<>();
//        for(int i=0;i<k;i++){
//            st.add(q.remove());
//        }
//        for(int i=0;i<k;i++){
//            q.add(st.pop());
//        }
//
//        for(int i=0;i<k;i++){
//            q.add(q.remove());
//        }
//        System.out.println(q);


        //  //queue is palindrom or not
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all queue elements into stack
        for (int num : queue) {
            stack.push(num);
        }

        boolean isPalindrome = true;

        // Step 2: Compare queue and stack
        for (int num : queue) {
            if (num != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
 }
