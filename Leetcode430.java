/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        // if the LL will consist of 1 node only then it may have child, so that cannot be basecase
        Node curr=head;
        while(curr!=null){
            if(curr.child==null) curr=curr.next;
            else{
                Node fwd=curr.next; // mark the next node to current
                Node c=flatten(curr.child); // it will flatten the child LL using recursion 
                curr.child=null; //since the LL is flatten then there is no point of child, and also we do not want it ATQ
                curr.next=c; // connect current node to child
                c.prev=curr; // connect the child to current as welll, since it is a doubly LL
                Node temp=c; // temporary node to reach the end of child LL
                while(temp.next!=null) temp=temp.next;
                temp.next=fwd; //connecting last node of child LL to the next node of current 
                if(fwd!=null) fwd.prev=temp; // the next node to current may be null ,therefore check it before connecting the next node to current to last node of child LL
                curr=fwd; //move current node to next one
            }
        }
        return head;
    }
}