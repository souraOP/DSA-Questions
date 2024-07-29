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
        while(headB != null){
            ListNode temp1 = headA;
            while(temp1 != null){
                if(temp1 == headB) return headB;
                temp1= temp1.next;
            }
            headB = headB.next;
        }
        return null;
    }
}