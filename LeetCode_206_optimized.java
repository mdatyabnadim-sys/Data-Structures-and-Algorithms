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
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
       ListNode frwd=null;
       ListNode current=head;
       while(current!=null){
        frwd=current.next;
        current.next=prev;
        prev=current;
        current=frwd;
       }
       return prev;
    }
}