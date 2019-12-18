
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