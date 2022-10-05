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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(val-1);
        prev.next = head;
        
        ListNode node = prev;
        while (node != null) {
            if (node.next != null && node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        
        return prev.next;
    }
}