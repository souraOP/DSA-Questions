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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traverse = new ArrayList<>();
        if(root != null){
            traverse.add(root.val);
            traverse.addAll(preorderTraversal(root.left));
            traverse.addAll(preorderTraversal(root.right));
            return traverse;
        }
        return traverse;
        
    }
}