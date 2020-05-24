/*
Given two sorted integer arrays nums1 and nums2, 
merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2.

Example:
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
Output: [1,2,2,3,5,6]
 */



//Rumtime: 0 ms
//Approach: Two Pointer, start from  beginning
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]  newNums = new int[m];
        System.arraycopy(nums1, 0, newNums, 0, m);
        
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        
        while((p1 < m) && (p2 < n)){
            nums1[p++] = newNums[p1] < nums2[p2] ? newNums[p1++] : nums2[p2++];
        }
        
        if(p1 < m)
            System.arraycopy(newNums, p1, nums1, (p1+p2),(m - p1) );
        
        if(p2 < n)
            System.arraycopy(nums2, p2, nums1, (p1+p2),(n-p2));
        
    }
}


//Runtime: 0ms
//Approach: Two Pointer, start from the end of nums1
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p = m-1;
        int q = n-1;
        int index = m+n-1;

        while(p>=0 && q>=0){
            nums1[index--] = nums1[p] > nums2[q] ? nums1[p--] : nums2[q--];
        }
        
        System.arraycopy(nums2, 0, nums1, 0, q+1);

    }
}