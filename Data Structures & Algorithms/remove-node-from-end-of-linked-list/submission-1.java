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
        //neg case
        if(head==null)
            return null;
        //Count
        ListNode start=head;
        int count = 0;
        while(start!=null){
            count++;
            start = start.next;
        }
        if(count-n<0)
            return head;
        
        start=head;
        ListNode prev = null;
        int i = 0;
        while(start!=null){
            i++;
            if(i==count-n+1){
                if(prev==null)
                    head = start.next;
                else
                    prev.next = start.next;
            }
            else{
                prev = start;      
            }
            start = start.next;
        }
        return head;
    }
}
