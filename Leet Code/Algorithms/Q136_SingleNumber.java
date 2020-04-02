/*
Given a non-empty array of integers, 
every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */

//Approch: Hash Table
//Runtime: 7 ms
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i: nums){
            set.put(i, set.getOrDefault(i, 0) +1 );
        }

        for(int i : nums){
            if(set.get(i) == 1)
                return i;
        }
        return 0;
    }
}

//Approch: Bitwise Operation
//Runtime: 0 ms

/*Note: 
    a ^ 0 = a
    a ^ a = 0
    a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b

*/
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i: nums){
            a ^= i;
        }
        return a;
    }
}