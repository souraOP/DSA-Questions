/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        TreeNode head = bstConverter(nums, 0, nums.length-1);
        return head;
    }
    public TreeNode bstConverter(int[] num, int low, int high){
        if(low > high){
            return null;
        }
        int mid = low + (high - low)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = bstConverter(num, low, mid - 1);
        node.right = bstConverter(num, mid + 1, high);
        return node;
    }
}