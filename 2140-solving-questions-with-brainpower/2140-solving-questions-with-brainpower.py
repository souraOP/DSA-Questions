class Solution:
    
    def mostPoints(self, questions: List[List[int]]) -> int:
        cache = [0] * len(questions)
        def backtrack(i):
            if i >= len(questions):
                return 0
            if cache[i]:
                return cache[i]

            points, bpower= questions[i]
            cache[i] = max(
                # skip
                backtrack(i + 1),
                # choose the points
                points + backtrack(i + 1 + bpower)    
            )
            return cache[i]
        return backtrack(0)
    

        
