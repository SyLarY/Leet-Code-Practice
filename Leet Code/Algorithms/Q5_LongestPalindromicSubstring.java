/*
Given a string s, find the longest palindromic substring in s. 
You may assume that the maximum length of s is 1000.

Example 1:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: "cbbd"
Output: "bb"

 */

class Solution {
    public String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		int startIndex = 0, endIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			int length1 = expand(s, i, i);
			int length2 = expand(s, i, i + 1);
			int maxLength = Math.max(length1, length2);
			if (maxLength > (endIndex - startIndex)) {
				startIndex = i - (maxLength - 1) / 2;
				endIndex = i + maxLength / 2;
			}
		}
		return s.substring(startIndex, endIndex + 1);
	}

	public int expand(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}