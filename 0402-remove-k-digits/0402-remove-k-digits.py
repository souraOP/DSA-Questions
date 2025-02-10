class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        if not num:
            return ""
        if len(num) == k:
            return "0"
        stack = []
        for i in num:
            # stack[-1] = stack.top or stack.peek()
            while(stack and k > 0 and stack[-1] > i):
                stack.pop()
                k -=1
            stack.append(i)
        #if k > 0
        if k > 0:
            stack=stack[:-k]
        else:
            stack
        
        ans=''.join(stack).lstrip('0')
        return ans if ans else "0"