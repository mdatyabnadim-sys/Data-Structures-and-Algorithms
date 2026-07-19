class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        // Edge cases: empty list or single node → no rotation needed
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        // Step 1: Find length of the list
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        // Step 2: Reduce k (rotating n times gives same list)
        k = k % n;

        // If k becomes 0 → no rotation needed
        if (k == 0) return head;

        // Step 3: Move fast pointer k+1 steps ahead of slow
        // This ensures slow stops at node BEFORE new head
        for (int i = 1; i <= k + 1; i++) {
            fast = fast.next;
        }

        // Step 4: Move both pointers together
        // When fast reaches null, slow will be at the cut point
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 5: Define new head
        ListNode newHead = slow.next;

        // Break the list at slow
        slow.next = null;

        // Step 6: Find tail of second part
        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Step 7: Connect tail to original head
        tail.next = head;

        return newHead;
    }
}