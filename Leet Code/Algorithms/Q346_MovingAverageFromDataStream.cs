/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
 
*/

public class MovingAverage {
    int size;
    List<int> list = new List<int>();
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double Next(int val) {
        list.Add(val);
        int sum =0;
        for(int i = Math.Max(0, (list.Count - size)); i < list.Count; i++){
            sum += list[i];
        }
        return (sum/(double)(list.Count>=size?size:list.Count));
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.Next(val);
 */