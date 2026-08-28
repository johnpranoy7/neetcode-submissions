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
    //Divide and Conquer
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;
        return divide(lists, 0, lists.length-1);
    }

    public ListNode divide(ListNode[] lists, int start, int end){
        //base
        if(start==end)
            return lists[start];
        int mid = (start + end )  / 2;
        ListNode left = divide(lists, start, mid);
        ListNode right = divide(lists, mid+1, end);
        return merge(left,right);
    }

    public ListNode merge(ListNode a, ListNode b){
        if(a==null) return b;
        if(b==null) return a;
        ListNode mergeStart = new ListNode(0,null);
        ListNode current = mergeStart, temp = null;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                current.next = a;
                a = a.next;
            }else{
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }
        //if any list still has elements
        if(a!=null)
            current.next = a;
        else
            current.next = b;

        return mergeStart.next;
    }
}
