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
        if(lists.length == 0){
            return null;
        }
        ListNode merged = null;
        for(ListNode head: lists){
            merged = mergeLists(merged, head);
        }
        return merged;
        
    }
    public ListNode mergeLists(ListNode ptr1, ListNode ptr2){
        if(ptr1 == null) return ptr2;
        if(ptr2 == null) return ptr1;
        if(ptr1.val < ptr2.val){
            ptr1.next = mergeLists(ptr1.next, ptr2);
            return ptr1;
        } else {
            ptr2.next = mergeLists(ptr1, ptr2.next);
            return ptr2;
        }
    }
}