/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0;
        int lengthB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
          while(tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        int length=0;
        if(lengthA>=lengthB) length=lengthA-lengthB;
        else length=lengthB-lengthA;

        for(int i=1;i<=length;i++){
            if(lengthA>=lengthB) tempA=tempA.next;
            else tempB=tempB.next;
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}