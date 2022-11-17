/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target || original == null){
            return cloned;
        }
        
        //DFS implementation
        TreeNode originalLeft = original.left;
        TreeNode clonedLeft = cloned.left;
        TreeNode left = getTargetCopy(originalLeft, clonedLeft, target);
        if(left != null){
            return left;
        }
        TreeNode originalRight = original.right;
        TreeNode clonedRight = cloned.right;
        TreeNode right = getTargetCopy(originalRight, clonedRight, target);
        return right;
    }
}