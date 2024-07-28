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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null){
            return head;
        }
//         Stack<Integer> st = new Stack<>();
//         ListNode temp = head;
//         // push all the nodes into the stack
//         while(temp != null){
//             st.push(temp.val);
//             temp = temp.next;
//         }
        
//         // after pushing every node into the stack
//         // pop from the stack so that they come out as reverse order
//         temp = head;
//         while(temp != null){
//             temp.val = st.pop();  // assigning the original linkedlist value as the stack pop value.
//             temp = temp.next;
//         }
//         // so that when we return head the linked list will be in reverse order
//         return head;
        
        //optimal approach
        // here we are reversing the nodes one by one as we traverse the linkedlist 
        
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev= temp;
            temp= front;
        }
        return prev;
    }
}