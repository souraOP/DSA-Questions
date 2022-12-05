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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkSymmetry(root.left, root.right);
    }
    public boolean checkSymmetry(TreeNode leftSubtree, TreeNode rightSubtree){
        if(leftSubtree == null || rightSubtree == null){
            return leftSubtree == rightSubtree;
        }
        if(leftSubtree.val != rightSubtree.val) return false;
        return checkSymmetry(leftSubtree.left, rightSubtree.right) && checkSymmetry(leftSubtree.right, rightSubtree.left);
    }
}