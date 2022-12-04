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
    public ListNode mergeKLists(ListNode[] lists) {
        //Using Priority Queue
        PriorityQueue<Integer> resultList = new PriorityQueue<>();
        for(ListNode heads: lists){
            while(heads != null){
                resultList.add(heads.val);
                heads = heads.next;
            }
        }
        ListNode ptr = new ListNode(0);
        ListNode curr = ptr;
        while(!resultList.isEmpty()){
            ListNode ankita = new ListNode(resultList.poll());
            ptr.next = ankita;
            ptr = ptr.next;
        }
        return curr.next;
    }
}