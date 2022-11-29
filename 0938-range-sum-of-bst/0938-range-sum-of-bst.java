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
    private int result = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        depthFirstSearch(root, low, high);
        return result;
    }
    public void depthFirstSearch(TreeNode node, int low, int high){
        if(node != null){
            if(low <= node.val && node.val <= high){
                result += node.val;
            }
            if(low < node.val){
                depthFirstSearch(node.left, low, high);
            }
            if(node.val < high){
                depthFirstSearch(node.right, low, high);
            }
        }
    } 
}