public class Linked {
      //In two list find starting point where same data started (intersection of two lists)
      Node head;
      class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
      }  //insert data
     void insert(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head =newnode;
      }  
      void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.println("null");
     }
    
    public static void main(String[] args) {
        Linked list1 =new Linked();
        Linked list2 =new Linked();
        list1.insert(10);
        list1.insert(8);
        list1.insert(6);
        list1.insert(3);
        list1.print();
        list2.insert(10);
        list2.insert(8);
        list2.insert(4);
        list2.print();

    }  
    
}
