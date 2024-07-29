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
    public ListNode sortList(ListNode head) {
        // 1st approach
        // 1. Turn the linkedlist into an array
        // 2. Sort those array
        // 3. again convert them back to a new linkedlist
        
        if(head == null){
            return null;
        }
        
        // make an arraylist
        ArrayList<Integer> list = new ArrayList<>();
        
        // make a temp node pointing to head
        ListNode temp = head;
        // traverse the linkedlist and put those temp.val into the arraylist
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        // sort the array
        Collections.sort(list);
        
        // point temp to head , for again traversing the linkedlist
        temp = head;
        
        for(int i=0; i<list.size(); i++){
            // put the sorted values in place of the temp.val of original linkedlist
            temp.val= list.get(i);
            temp = temp.next;
        }
        
        return head;

    }
}