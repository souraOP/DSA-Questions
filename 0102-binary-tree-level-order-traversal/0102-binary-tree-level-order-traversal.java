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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // initialize an empty 2d arraylist 
        // this list stores the BST traversal with sublist meaning the levels of the tree
        List<List<Integer>> res = new ArrayList<>();
        // if the root doesn't exists, then return the empty list
        if (root==null){
            return res;
        }
        // initialize an empty queue with TreeNode as generic interface
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            // get the level of the tree
            int treeLevel = q.size();
            // store the sublist
            List<Integer> sublist = new ArrayList<>();
            // traverse in that level
            for(int i = 0; i < treeLevel; i++){
                // get the topmost element of the queue
                TreeNode node = q.peek();
                q.poll();
                // check if left subtree exists or not for the 'node'
                // if exists then push that into the queue
                if(node.left != null){
                    q.offer(node.left);
                }
                // check if right subtree exists or not for the 'node'
                // if exists then push that into the queue
                if(node.right != null){
                    q.offer(node.right);
                }
                // after that add the node into the sublist
                sublist.add(node.val);
            }
            // finally push the sublist into the resultant arraylist
            res.add(sublist);
        }
        // return the resultant arraylist
        return res;
    }
}