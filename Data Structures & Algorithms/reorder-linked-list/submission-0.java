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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode fast = head, slow = head, prevSlow = head;
        while(fast!=null && fast.next!=null){
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse list from mid to end
        ListNode curr = slow.next;
        ListNode prev = slow.next = null, temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        System.out.println(slow.val + " ");

        //Merge 2 lists
        ListNode list1=head, list2=prev;
        ListNode temp1=null, temp2=null;
        while(list2!=null){
            temp1 = list1.next;
            temp2 = list2.next;
            list1.next = list2;
            list2.next = temp1;
            list1 = temp1;
            list2 = temp2;
        }

        // while(head!=null){
        //     System.out.println(head.val);
        //     head = head.next;
        // }

    }
}
