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
        ListNode temp2 = headB;

        while(temp2 != null){
            ListNode temp1 = headA;
            while(temp1 != null){
                if(temp1 == temp2) return temp2;
                temp1= temp1.next;
            }
            temp2 = temp2.next;
        }
        return null;
    }
}