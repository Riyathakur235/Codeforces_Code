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
        newnode.next=head;
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
     void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.println("null");
     }
     void delete(){
        if(head==null){
            return;
        }
        head =head.next;
    }
    void deletend(){
        while(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next.next;
        }
        temp.next=null;
    }
    //reverse the linkedlist
      void reverse(){
        Node curr=head;
        Node prev=null;
       while(curr!=null){
           Node next =curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
    }
    //mid find
    void middle(){
        Node slow=head;
        Node fast=head;
        while (slow.next!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    //cycle find
    void cycle(){
        Node slow =head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                System.out.println("Has Cycle");
            }
        }
        System.out.println("No Cycle");
    }
    public static void main(String[] args) {
       Linkedlist list = new Linkedlist();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.print();
       list.insertadd(4);
       list.print();
    //    list.delete();
    //    list.deletend();
    //    list.print();
          list.reverse();
          list.print(); 
          list.middle();
          list.print();  
          list.cycle();
    }
}
