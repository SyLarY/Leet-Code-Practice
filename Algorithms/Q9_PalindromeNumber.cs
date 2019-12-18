/*
Determine whether an integer is a palindrome. 
An integer is a palindrome when it reads the same backward as forward.

Example 1:
Input: 121      Output: true

Example 2:
Input: -121     Output: false
Explanation: From left to right, it reads -121. 
From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: 10       Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up:
Coud you solve it without converting the integer to a string?
*/


//Runtime: 60 ms
//Memory: 15.3 MB
public class Solution {
    public bool IsPalindrome(int x) {
        int sum =0;
        int r; //to store remainder 
        int temp = x;
   
        while (x>0){
            r = x % 10;//get last digit of x
            sum = (sum * 10) + r;//add r to sum to make a reverted number of x
            x = x / 10;//get rid of last digit of x
        }
        
       return temp == sum;
    }
}