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
    public boolean hasCycle(ListNode head) {
        //Using Floyd's tortoise and hare algorithm
        ListNode soura = head, ankita = head;
        while(ankita != null && ankita.next != null){
            soura = soura.next;
            ankita = ankita.next.next;
            if(soura == ankita) return true;
        } 
        return false;
        
    }
}