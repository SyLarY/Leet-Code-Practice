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


//Runtime: 1ms

class Solution {
	public boolean isValid(String s) {
        Map<Character, Character> maps = new HashMap<>();
        maps.put(')','(');
        maps.put('}','{');
        maps.put(']','[');
        
        Stack<Character> stack = new Stack<Character>();
        char[] ch = s.toCharArray();
        
        for(char c : ch){
            if(maps.containsKey(c)){
                char top = stack.empty() ? '#' : stack.pop();
                if(top != maps.get(c))
                 return false;
            }else{
                stack.push(c);
            }           
        }
        return stack.isEmpty();
    }
}

//Approach 2: 
    //for open bracket in string -> push its close bracket to stack instead
    //for close bracket in string -> pop the top element of stack and check if they are the same. 
//Runtime: 1ms
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c =='('){
                stack.push(')');
            }
            else if( c =='{'){
                stack.push('}');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}