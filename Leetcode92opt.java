/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public void reverse(ListNode head) {
       ListNode prev=null;
       ListNode frwd=null;
       ListNode current=head;
       while(current!=null){
        frwd=current.next;
        current.next=prev;
        prev=current;
        current=frwd;
       }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        dummy.next=head;
        for(int i=1;i<=left-1;i++){
           temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head2=tail1.next;
        for(int i=1;i<=right-left+1;i++){
            temp=temp.next;
        }
        ListNode tail2=temp;
        ListNode head3=tail2.next;

        tail1.next=null;
        tail2.next=null;

        reverse(head2);

        tail1.next=tail2;
        head2.next=head3;

        return dummy.next;
    }
}