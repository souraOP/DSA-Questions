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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dNode = new ListNode();
        ListNode prev = dNode;
        ListNode currentNode = head;
        while(currentNode != null && currentNode.next != null){
            prev.next = currentNode.next;
            currentNode.next = prev.next.next;
            prev.next.next = currentNode;
            prev = currentNode;
            currentNode = currentNode.next;
        }
        return dNode.next;
    }
}