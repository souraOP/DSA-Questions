/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode ptr1;
        ListNode ptr2;
        int l1 = nodeLength(headA);
        int l2 = nodeLength(headB);
        int node_difference = Math.abs(l1 -l2);
        if(l1 > l2){
            ptr1 = headA;
            ptr2 = headB;
        } else {
            ptr1 = headB;
            ptr2 = headA;
        }
        while(node_difference != 0){
            ptr1 = ptr1.next;
            if(ptr1 == null){
                return null;
            }
            node_difference--;
        }
        while(ptr1 != null && ptr2 != null){
            if(ptr1 == ptr2){
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
    }
    public int nodeLength(ListNode head){
        int node_len = 0;
        ListNode tmp = head;
        while(tmp != null){
            node_len++;
            tmp = tmp.next;
        }
        return node_len;
    }
}