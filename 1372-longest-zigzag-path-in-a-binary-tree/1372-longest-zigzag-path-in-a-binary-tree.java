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
    public int maxL = 0;
    public int longestZigZag(TreeNode root) {
        solve(root, 0, 0);
        solve(root, 1, 0);
        return maxL;
    }
    public void solve(TreeNode root, int current, int currentLength){
        if(root == null){
            return;
        }
        maxL = Math.max(maxL, currentLength);
        if(current == 1){
            solve(root.left, 0, currentLength+1);
            solve(root.right, 1, 1);
        } else {
            solve(root.right, 1, currentLength+1);
            solve(root.left, 0, 1);
        }
    }
}