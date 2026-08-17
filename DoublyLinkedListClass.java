class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}
class DLL{
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertAtTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0){
            System.out.println("List is Empty");
            return;
        }
        if(size==1) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List is Empty!");
            return;
        }
        if(size==1) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
       void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp=temp.prev;
        }
        System.out.println();
    }
}
public class DoublyLinkedListClass {
    public static void main(String[] args){
       DLL list=new DLL();
       list.insertAtHead(1);
       list.display();
       list.insertAtHead(2);
       list.display();
       list.insertAtTail(3);
       list.display();
       list.insertAtTail(4);
       list.display();
       list.displayReverse();
       list.deleteAtHead();
       list.display();
       list.deleteAtTail();
       list.display();
       list.displayReverse();
    }
}