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
    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref= head;
        return check(ref);
    }
    public boolean check(ListNode node){
        if(node == null) return true;
        boolean answerFinal = check(node.next);
        boolean checkPalindrome = (ref.val == node.val)? true : false; 
        ref = ref.next;
        return answerFinal && checkPalindrome;
    }
}