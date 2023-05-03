class Solution(object):
    def findDifference(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[List[int]]
        """
        Set1 = set(nums1)
        Set2 = set(nums2)
        return [list(Set1 - Set2), list(Set2 - Set1)]
        