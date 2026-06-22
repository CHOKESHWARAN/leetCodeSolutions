class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)
        merged = []
        i, j = 0, 0
 
        while i < m and j < n:
            if nums1[i] < nums2[j]:
                merged.append(nums1[i])
                i += 1
            else:
                merged.append(nums2[j])
                j += 1
 
        merged.extend(nums1[i:])
        merged.extend(nums2[j:])
 
        total_length = m + n
        if total_length % 2 == 0:
            return (merged[total_length // 2 - 1] + merged[total_length // 2]) / 2.0
        else:
            return float(merged[total_length // 2])