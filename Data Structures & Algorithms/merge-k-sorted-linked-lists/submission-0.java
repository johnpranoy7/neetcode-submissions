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
        if(lists==null || lists.length==0)
            return null;
        int i=1;
        for(i=1;i<lists.length;i++){
            lists[i] = mergeTwo(lists[i-1],lists[i]);
        }
        return lists[lists.length-1]; 
    }

    public ListNode mergeTwo(ListNode listA, ListNode listB){
        if (listA == null) return listB;
        if (listB == null) return listA;
        ListNode start = new ListNode(0,null);
        ListNode head = start;
        while(listA!=null && listB!=null){
            if(listA.val<=listB.val)
            {
                head.next = listA;
                listA = listA.next;
            }else{
                head.next = listB;
                listB = listB.next;
            }
            head = head.next;
        }
        if(listB!=null){
            head.next=listB;
        }else if(listA!=null)
            head.next=listA;
        return start.next;
    }
}
