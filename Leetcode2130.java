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
      public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        ListNode forward=null;
        while(current!=null){
            forward=current.next;
            current.next=previous;
            previous=current;
            current=forward;
        }
        return previous;
    }

    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
        
        int max=Integer.MIN_VALUE;
        ListNode i=head;
        ListNode j=head2;
        while(j!=null){
            if(i.val+j.val>max) max=i.val+j.val;
            i=i.next;
            j=j.next;
        }
        return max;
    }
}