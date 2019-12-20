
class Q7_ReverseInteger
{
    /*
        Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:
        Input: 123
        Output: 321

        Example 2:
        Input: -123
        Output: -321

        Example 3:
        Input: 120
        Output: 21
     */

    static void Main(string[] args)
    {
        Console.WriteLine(Reverse(123));
        Console.WriteLine(Reverse(-123));
        Console.WriteLine(Reverse(120));
    }

    public static int Reverse(int x)
    {
        if (x == 0) return 0;
        bool flag = x > 0; //To determine input is positive number or negative number
        int value = flag ? x : -x;
        long result = 0;
        while (value > 0)
        {
            int num = value % 10;
            value = value / 10;
            result = result * 10 + num;
            if (result > int.MaxValue) return 0;
        }

        return (int)(flag ? result : -result);
    }
}

