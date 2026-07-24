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

//Approach 1
//  class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null || head.next==null) return head;
//         ListNode temp=head;
//         ArrayList<ListNode> arr=new ArrayList<>();
//         while(temp!=null){
//            arr.add(temp);
//            temp=temp.next;
//         }
//         int n=arr.size();
//         for(int i=n-1;i>=1;i--){
//             arr.get(i).next=arr.get(i-1);
//         }
//         arr.get(0).next=null;
//         return arr.get(n-1);

//     }
// }

 //Approach 2
// class Solution {
//     public ListNode reverseList(ListNode head) {
//        ListNode prev=null;
//        ListNode frwd=null;
//        ListNode current=head;
//        while(current!=null){
//         frwd=current.next;
//         current.next=prev;
//         prev=current;
//         current=frwd;
//        }
//        return prev;
//     }
// }

//Approach 3

class Solution{
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode a=head.next;
        head.next=null;
        ListNode b=reverseList(a);
        a.next=head;
        return b;
    }
}