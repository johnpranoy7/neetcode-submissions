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
    //Min Heap Approach
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>( (a,b) -> a.val - b.val);
        //insert all lists to PQ
        for(ListNode list : lists)
            minHeap.add(list);
        
        ListNode start = new ListNode(0, null);
        ListNode current = start, temp=null;
        while(current!=null){
            temp = minHeap.poll();
            current.next = temp;
            current = current.next;
            if(temp!=null && temp.next!=null){
                minHeap.add(temp.next);
            }
        }

        return start.next; 
    }
}
