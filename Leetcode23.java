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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> arr=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            arr.add(lists[i]);
        }
        while(arr.size()>1){
            ListNode a =arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c=merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
     public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null) temp.next=list2;
        else temp.next=list1;
        return dummy.next;
    }
}