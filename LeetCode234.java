/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode temp=head;
//         ArrayList<Integer> arr=new ArrayList<>();
//         while(temp!=null){
//             arr.add(temp.val);
//             temp=temp.next;
//         }
//         int n=arr.size();
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             int a=arr.get(i);
//             int b=arr.get(j);
//             if(a!=b) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

class Solution{
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
    public boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);

        ListNode i=head;
        ListNode j=head2;
        while(j!=null){
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}