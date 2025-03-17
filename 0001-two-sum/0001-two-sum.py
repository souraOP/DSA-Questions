class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # for i in range(0, len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if(nums[i] + nums[j] == target):
        #             return [i, j]

        # return []

        n = len(nums)
        map = {}
        for i in range(n):
            cm = target - nums[i]
            if cm in map:
                return [map[cm], i]
            map[nums[i]] = i
        return []