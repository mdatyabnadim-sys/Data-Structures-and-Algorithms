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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;

        while (temp1 != null && temp2 != null) {
            ListNode ans = new ListNode((temp1.val + temp2.val + carry) % 10);
            carry = (temp1.val + temp2.val + carry) / 10;
            curr.next = ans;
            curr = ans;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp2 != null && temp1 == null) {
            ListNode ans = new ListNode((temp2.val + carry) % 10);
            carry = (temp2.val + carry) / 10;
            curr.next = ans;
            curr = ans;
            temp2 = temp2.next;
        }

        while (temp1 != null && temp2 == null) {
            ListNode ans = new ListNode((temp1.val + carry) % 10);
            carry = (temp1.val + carry) / 10;
            curr.next = ans;
            curr = ans;
            temp1 = temp1.next;
        }
        if (carry != 0)
            curr.next = new ListNode(carry);
        return dummy.next;
    }
}