from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1  # Initialize pointers
        
        while l <= r:
            mid = l + (r - l) // 2  # Calculate the middle index
            
            if nums[mid] == target:  # Check if target is found
                return mid
            
            # Determine which half is sorted
            if nums[mid] >= nums[l]:  # Left half is sorted
                if nums[l] <= target < nums[mid]:  # Target is in the sorted left half
                    r = mid - 1
                else:  # Target is in the unsorted right half
                    l = mid + 1
            else:  # Right half is sorted
                if nums[mid] < target <= nums[r]:  # Target is in the sorted right half
                    l = mid + 1
                else:  # Target is in the unsorted left half
                    r = mid - 1
        
        return -1  # Target not found
