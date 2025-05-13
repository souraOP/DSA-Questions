# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans = []
        self.inorder(root, ans)
        return ans

    def inorder(self, root: TreeNode, ans: List[int]):
        if root is None:
            return
        
        # left subtree
        self.inorder(root.left, ans)
        # get the root
        ans.append(root.val)
        # right subtree
        self.inorder(root.right, ans)