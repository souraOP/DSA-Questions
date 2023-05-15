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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prev = head, curr= head, pointer = head;
        for(int i = 0; i < k - 1; i++){
            prev = prev.next;
        }
        pointer = prev;
        
        while(prev.next != null){
            prev = prev.next;
            curr= curr.next;
        }
        int temp = pointer.val;
        pointer.val = curr.val;
        curr.val = temp;
        
        return head;
    }
    
}