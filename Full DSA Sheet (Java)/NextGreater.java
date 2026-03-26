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

//find next greater element in two arrays using stack and hashmap
//public class NextGreater {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         Stack<Integer> stack = new Stack<>();
//        HashMap<Integer,Integer> map= new HashMap<>();
//        for (int num : nums2) {
//            while (!stack.isEmpty() && num > stack.peek()) {
//                map.put(stack.pop(), num);
//            }
//            stack.push(num);
//        }
//
//        while (!stack.isEmpty()) {
//            map.put(stack.pop(), -1);
//        }
//
//        int[] ans = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            ans[i] = map.get(nums1[i]);
//        }
//
//        return ans;
//    }
//}