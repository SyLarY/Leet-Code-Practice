using System;
/*
Let's say a positive integer is a superpalindrome if it is a palindrome, and it is also the square of a palindrome.

Now, given two positive integers L and R (represented as strings), return the number of superpalindromes in the inclusive range [L, R].

 

Example 1:

Input: L = "4", R = "1000"
Output: 4
Explanation: 4, 9, 121, and 484 are superpalindromes.
Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
 

Note:

1 <= len(L) <= 18
1 <= len(R) <= 18
L and R are strings representing integers in the range [1, 10^18).
int(L) <= int(R)
 
*/


//time limit exceeded
public class Solution
{
    public int SuperpalindromesInRange(string L, string R)
    {
        long l = Convert.ToInt64(L);
        long r = Convert.ToInt64(R);
        long minRange = (long) Math.Round(Math.Sqrt(l));
        long maxRange = (long) Math.Round(Math.Sqrt(r));
        int count = 0;
        for (long i = minRange; i <= maxRange; i++)
        {
            if (IsPalindrome(i) && IsPalindrome(i*i))
                count++;
        }

        return count;
    }

    public bool IsPalindrome(long num)
    {
        long r, result = 0;
        long temp = num;

        while (num > 0)
        {
            r = num % 10;
            result = (result * 10) + r;
            num /= 10;
        }
        return temp == result ? true : false;
    }

}