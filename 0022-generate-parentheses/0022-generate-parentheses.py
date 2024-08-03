class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []

        
        def dfs(openP, closeP, s):
            if(openP == closeP) and (openP + closeP == n * 2):
                ans.append(s)
                return
            
            if openP < n:
                dfs(openP + 1, closeP, s + "(")
            if closeP < openP:
                dfs(openP, closeP + 1, s + ")")
        dfs(0, 0, "")
        return ans

    
