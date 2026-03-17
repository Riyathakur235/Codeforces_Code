public class Linkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //insert data
     void insert(int data){
        Node newnode=new Node(data);
        newnode.data=data;
        head =newnode;
     }
     //to add new node
     void insertadd( int data) {
         Node newnode = new Node(data);
         if (head == null) {
          head=newnode;
          return;
         }
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=newnode;
     }
    public static void main(String[] args) {
       Linkedlist list = new Linkedlist();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.insertadd(4);

    }
}
