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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        ListNode ptr = null;
        if(list1.val < list2.val){
            ptr = list1;
            list1 = list1.next;
        } else {
            ptr = list2;
            list2 = list2.next;
        }
        ListNode initial = ptr;
        while (list2 != null && list1 != null){
            if(list1.val > list2.val){
                initial.next = list2;
                list2 = list2.next;
            } else {
                initial.next = list1;
                list1 = list1.next;
            }
            initial = initial.next;
        }
        if(list1 != null){
            initial.next = list1;
        } else {
            initial.next = list2;
        }
        return ptr;
    }
}