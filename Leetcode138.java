/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopy(Node head1){
        Node temp1=head1;
        Node head2=new Node(-1);
        Node temp2=head2;
        while(temp1!=null){
            Node t= new Node(temp1.val);
            temp2.next=t;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return head2.next;
    }
    public void merge(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node temp1=head1;
        Node temp2=head2;
         while(temp2!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;

            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
         }
    }
    public void randomConnections(Node head1,Node head2){
        Node t1=head1;
        Node t2=head2;
        while(t1!=null && t2!=null){
            if(t1.random==null) t2.random=null;
            else t2.random=t1.random.next;
            t1=t1.next.next;
            if(t2.next!=null) t2=t2.next.next;
        }
    }
    public void split(Node head1){
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node t1=d1;
        Node t2=d2;
        Node t=head1;

        while(t!=null){
            t1.next=t;
            t=t.next;
            t1=t1.next;

            t2.next=t;
            t=t.next;
            t2=t2.next;
        }
        t1.next=null;
    }
    public Node copyRandomList(Node head1) {
        // Step 1: create a deep copy without random connections
        Node head2=deepCopy(head1);

        //Step 2: Connect both LL alternatively
        merge(head1,head2);

        //Step 3: Assigning random pointers
        randomConnections(head1,head2);

        //step 4: Spitting the combined list
        split(head1);

        return head2;
    }
}