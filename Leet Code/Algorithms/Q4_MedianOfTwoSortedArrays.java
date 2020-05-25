/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */

//Runtime: 2ms
//Approach: merge with two pointer and find median index
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;
        int medianIndex = (length) /2;
        int[] newArray = new int[length];
        int count = 0,
        p = 0,
        q = 0;
        
        while(p < nums1.length && q < nums2.length){
            newArray[count++] = nums1[p] <= nums2[q] ? nums1[p++] : nums2[q++];
        }
        
        
        if(p < m )
            System.arraycopy(nums1, p, newArray, p+q, m-p);
        
        if(q < n)
            System.arraycopy(nums2, q, newArray, p+q, n-q);
        
        return length % 2 == 0 ? 
            (double)(newArray[medianIndex] + newArray[medianIndex - 1])/2.0 : 
            (double)newArray[medianIndex];
    }
}