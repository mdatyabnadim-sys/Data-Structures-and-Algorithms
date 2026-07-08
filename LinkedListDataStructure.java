package Linked_List;

class Linkedlist{
    int size=0;
    Node head;
    Node tail;

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;;
            tail=temp;
        }
        size++;
    }

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        head=head.next;
        if(head==null) tail=null;
        size--;
    }
   
    void delete(int idx){
        if(idx<0 || idx>=size){
         System.out.println("Invalid Index !");
         return;
        }
        if(idx==0) {
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1) tail=temp;
        size--;
    }

   void display(){
    if(head==null) return;
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
    System.out.println();
   }
}

public class LinkedListDataStructure {
    public static void main(String[] args){
        Linkedlist ll=new Linkedlist();

        ll.addAtHead(10);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();

        ll.addAtTail(20);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();

        ll.addAtHead(30);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();

        ll.addAtTail(40);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();

        ll.addAtTail(50);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();

        
        ll.delete(7);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();
        
        
        ll.delete(3);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();
        
        
        ll.delete(0);
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println();


    }
}