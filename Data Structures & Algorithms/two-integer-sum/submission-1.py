class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        towSummap={}
        for i in range(len(nums)):
            complement=target-nums[i]
            if complement in towSummap:
                return [towSummap[complement],i]
            towSummap[nums[i]]=i
        return [-1]*2