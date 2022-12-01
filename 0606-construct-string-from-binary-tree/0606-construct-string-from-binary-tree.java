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
    public String tree2str(TreeNode root) {
        if(root == null) return "";
        String answer = root.val + "";
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        if(left == "" && right == "") return answer;
        if(left == "") return answer + "()" + "(" + right +  ")";
        if(right == "") return answer + "(" + left + ")";
        return answer + "(" + left + ")" + "(" + right + ")";
    }
}