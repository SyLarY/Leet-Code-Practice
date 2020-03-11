/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.

An input string is valid if:
    1. Open brackets must be closed by the same type of brackets.
    2. Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true

 */

class Solution {
	public boolean isValid(String s) {
        Map<Character, Character> maps = new HashMap<>();
        maps.put(')','(');
        maps.put('}','{');
        maps.put(']','[');
        
        Stack stack = new Stack();
        char[] ch = s.toCharArray();
        char top = '';
        
        for(char c : ch){
            if(maps.containsKey(c)){
                 top = stack.empty() ? '#' : stack.pop();
            if(top != maps.get())
                return false;
            }else{
                stack.push(c);
            }
               return stack.isEmpty();
            
                
        }
    }
}