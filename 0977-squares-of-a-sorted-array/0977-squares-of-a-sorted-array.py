class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        # O (N log N)
        # n = len(nums)
        # for i in range(n):
        #     nums[i] = abs(nums[i] * nums[i])
        # return sorted(nums)

        n = len(nums)
        L, R = 0, n - 1
        ans = n * [0]
        for i in range(n-1, -1, -1):
            if abs(nums[L]) > abs(nums[R]):
                val = nums[L]
                L += 1
            else:
                val = nums[R]
                R -= 1
            ans[i] = val ** 2

        return ans