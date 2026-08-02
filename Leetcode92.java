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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int l=left-1;
        int r=right-1;
        while(l<r){
            ListNode t1=arr.get(l);
            ListNode t2=arr.get(r);
            arr.set(l,t2);
            arr.set(r,t1);
            l++;
            r--;
        }
       for(int i=0;i<arr.size();i++){
        arr.get(i).next= (i==arr.size()-1) ? null : arr.get(i+1);
       }
       return arr.get(0);
    }
}