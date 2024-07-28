/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first = head, second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                break;
            }
        }
        if(second == null || second.next == null){
            return null;
        }
        while(head != first){
            head = head.next;
            first = first.next;
        }
        return head;
    }
}