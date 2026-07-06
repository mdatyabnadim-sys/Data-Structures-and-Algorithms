package Linked_List;

class Linked {
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

    void insert(int idx, int val){
        if(idx==0) {
            addAtHead(val);
            return;
        }
        if(idx==size) {
            addAtTail(val);
            return;
        }
        if(idx>size || idx<0) {
            System.out.println("index cannot be negative or more than size");
            return;
            
        Node temp=head;
        Node t=new Node(val);
        t.next=temp.next;
        temp.next=t;
        size++;
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

public class insertion {
    public static void main(String[] args) {

        Linked ll = new Linked();

        System.out.println("---- Test 1: Insert in empty list ----");
        ll.insert(0, 10);  // should behave like addAtHead
        ll.display();
        System.out.println("Size: " + ll.size);
        System.out.println();

        System.out.println("---- Test 2: List size = 1 ----");
        ll.insert(0, 5);   // insert at head
        ll.display();

        ll.insert(2, 20);  // insert at tail
        ll.display();

        ll.insert(1, 15);  // insert in middle
        ll.display();
        System.out.println("Size: " + ll.size);
        System.out.println();

        System.out.println("---- Test 3: List size = 2 ----");
        Linked ll2 = new Linked();
        ll2.addAtHead(1);
        ll2.addAtTail(2);

        ll2.display();

        ll2.insert(0, 0);  // head
        ll2.display();

        ll2.insert(3, 3);  // tail
        ll2.display();

        ll2.insert(2, 99); // middle
        ll2.display();

        System.out.println("Size: " + ll2.size);
        System.out.println();

        System.out.println("---- Test 4: Insert at last position ----");
        Linked ll3 = new Linked();
        ll3.addAtTail(10);
        ll3.addAtTail(20);
        ll3.addAtTail(30);

        ll3.display();

        ll3.insert(ll3.size, 40); // last position
        ll3.display();

        System.out.println("Size: " + ll3.size);
        System.out.println();

        System.out.println("---- Test 5: Invalid index ----");
        ll3.insert(-1, 100);
        ll3.insert(100, 200);
    }
}