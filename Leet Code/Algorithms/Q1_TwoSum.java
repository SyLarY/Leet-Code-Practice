/*
* Given an array of integers, return indices of the two numbers such that 
    they add up to a specific target.
* You may assume that each input would have exactly one solution, 
    and you may not use the same element twice.
* Example:
* Given nums = [2, 7, 11, 15], target = 9,
* Because nums[0] + nums[1] = 2 + 7 = 9,
* return [0, 1].
*/

//Approach: Two Pass Hash Table
//Runtime: 3ms
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            table.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            int other = target - nums[i];
            if(table.containsKey(other) && table.get(other) != i){
                return new int[] {i, table.get(other)};
            }
        }
        
        throw new IllegalArgumentException("No Solution");
    }
}

//Approach: One Pass Hash Table
//Runtime: 2ms
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int other = target - nums[i];
            if(table.containsKey(other) && table.get(other) != i){
                return new int[] {i, table.get(other)};
            }            
             table.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No Solution");
    }
}