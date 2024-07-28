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
    public ListNode middleNode(ListNode head) {
            if(head == null){
            return null;
        }
    
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        // divide the count by math.ceil
        int pos = (int)Math.ceil(count / 2);
        for(int i = 0; i < pos; i++){
            temp = temp.next;
            
        }
        return temp;
    }
}