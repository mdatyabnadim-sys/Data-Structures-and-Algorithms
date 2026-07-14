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
public ListNode removeNthFromEnd(ListNode head, int n) {

    // Case 1: Only one node in list
    // Deleting the only node results in an empty list
    if(head.next == null) return null;

    // Case 2: List has exactly 2 nodes
    // Handle manually to avoid pointer complications
    if(head.next.next == null){
        if(n == 1) 
            // delete second node
            head.next = null;
        else 
            // delete first node (head)
            head = head.next;
        return head;
    }

    // Initialize two pointers
    ListNode slow = head;
    ListNode fast = head;

    // Move fast pointer n steps ahead
    for(int i = 1; i <= n; i++) {

        // If fast.next is null while moving,
        // it means n == length of list
        // So we need to delete the head node
        if(fast.next == null) {
            head = head.next;
            return head;
        }

        fast = fast.next;
    }

    // Move both pointers together
    // Maintain gap so slow stops before node to delete
    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }

    // Delete the nth node from end
    // slow is just before the target node
    slow.next = slow.next.next;

    return head; 
    }
}