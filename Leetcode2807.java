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
    int gcd(int a,int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        ListNode frwd=curr.next;
        while(frwd!=null){
        ListNode gc=new ListNode(gcd(curr.val,curr.next.val));
        curr.next=gc;
        gc.next=frwd;
        curr=frwd;
        frwd=curr.next;
        }
        return head;
    }
}