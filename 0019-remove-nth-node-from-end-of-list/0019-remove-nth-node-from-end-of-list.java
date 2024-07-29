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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        // getting the total length of the linkedlist using a count variable
        int count =0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        // if count is equal to the n that means it wants to delete the head
        if(count == n){
            ListNode newHead = head.next;
            head = null;
            return newHead;
        }
        int res = count - n;
        temp = head;
        for(int i = 1; i < res; i++){
            temp = temp.next;
        }
        ListNode deleteNode = temp.next;
        temp.next = temp.next.next;
        deleteNode = null;
        return head;
    }
}