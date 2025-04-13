class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # mydict = {}
        # for i in nums:
        #     if i not in mydict:
        #         mydict[i] = 0
        #     mydict[i] += 1
        
        # for value in mydict.values():
        #     if value > 1:
        #         return True
        # return False
        return len(set(nums)) != len(nums)

