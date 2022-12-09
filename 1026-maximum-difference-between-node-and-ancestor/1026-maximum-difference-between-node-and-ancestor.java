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
    public int maxAncestorDiff(TreeNode root) {
        return depthFirstSearch(root, root.val, root.val);
    }
    
    public int depthFirstSearch(TreeNode root, int x, int y){
        if(root == null){
            return y - x;
        }
        x = Math.min(x, root.val);
        y = Math.max(y, root.val);
        return Math.max(depthFirstSearch(root.left, x, y), depthFirstSearch(root.right, x, y));
    }
}