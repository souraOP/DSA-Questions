class Solution {
    static int ans = Integer.MIN_VALUE;
    private static int rec(Node root)
    {
        if(root==null) return 0;
        
        int left_tree  = rec(root.left);
        int right_tree = rec(root.right);
        
        int include = root.data + left_tree + right_tree;
        
        ans = Math.max(ans, include);
        
        return include;
    }
    public static int findLargestSubtreeSum(Node root) {
        // code here
        ans = Integer.MIN_VALUE;
        
        rec(root);
        
        return ans;
    }
}
