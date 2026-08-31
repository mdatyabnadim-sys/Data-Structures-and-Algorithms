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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode previous=head;
        ListNode current=head.next;
        int i=1;
        int prevCriticalpos=0;
        int firstCriticalpos=0;
        int minDist=Integer.MAX_VALUE;

        while(current.next!=null){
            if((current.val>previous.val && current.val>current.next.val) || (current.val<previous.val && current.val<current.next.val)){
                if(prevCriticalpos==0){
                   prevCriticalpos=i;
                   firstCriticalpos=i;
                }
                else{
                    minDist=Math.min(minDist,i-prevCriticalpos);
                    prevCriticalpos=i;
                }
            }
            i++;
            previous=current;
            current=current.next;
        }
        int[] ans=new int[2];
          if(minDist==Integer.MAX_VALUE){
            ans[0]=-1;
            ans[1]=-1;
          }
          else{
            ans[0]=minDist;
            ans[1]=prevCriticalpos-firstCriticalpos;
          }
          return ans;
    }
}