//import java.util.*;
import java.util.Stack;
public class NextGreater {
    static void nextgreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.println("-1"+" ");
            }else {
                System.out.print(stack.peek()+" ");
                
            }
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,4,3};
        nextgreater(arr);
    }
}