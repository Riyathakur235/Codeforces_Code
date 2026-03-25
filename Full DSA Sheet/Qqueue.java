import java.util.ArrayList;
import java.util.Stack;

public class Qqueue {
     static class Queue{
        ArrayList<Integer> queue =new ArrayList<>();

        //add
        void add(int data){
            queue.add(data);
        }

        //remove
        int  remove(){
            if(queue.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return queue.remove(0);
        }
        int peek() {
            if (queue.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return queue.get(0);
        }
        boolean isEmpty(){
            return queue.size()==0;
        }
        int size(){
        return queue.size();
        }
        static void reversek(Queue q,int k){
            if(q.isEmpty() || k<=q.size()){
                System.out.println("Queue is empty");
            }
            Stack<Integer> stack=new Stack<>();
            for(int i=0;i<k;i++){
                stack.push(q.remove());
            }
            while (!stack.isEmpty()){
                q.add(stack.pop());
            }
            int remainig =q.size()-k;
            for(int i=0;i<remainig;i++){
                q.add(q.remove());
            }
        }
        void display(){
            if(queue.isEmpty()){
                System.out.println();
                return;
            }
            for(int i=0;i<queue.size();i++){
                System.out.println(queue.get(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
       // int k=3;
      // q.reversek(q,k);
       q.display();
}
}