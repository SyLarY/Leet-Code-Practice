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

//Approach 1: Brute Force
public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.Length; i++)
            {
                for (int j = i+1; j < nums.Length; j++)
                {
                    if (nums[j] == target - nums[i])
                    {
                        return new int[] { i, j };
                    }
                }
            }
            throw new Exception("No Solution.");
    }
}

////Approach 2: Brute Force
public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Hashtable tbl = new Hashtable();
        
        for(int i = 0; i < nums.Length; i++)
        {
            tbl.Add(nums[i],i);
        }

        for (int i = 0; i < tbl.Count; i++)
        {
            int other = target - nums[i];
            if(tbl.Contains(other) &&  other != nums[i]){
                return new int [] {i, (int)tbl[other]};
            }
        }
        
        throw new Exception("No Solution");
    }
}