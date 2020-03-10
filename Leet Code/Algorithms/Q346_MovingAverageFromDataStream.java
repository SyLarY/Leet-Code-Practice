/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
 
*/
//Approch 2 : Using Deque
//Runtime: 21ms

class MovingAverage {
    int size;
    int sum, count = 0 ;
    Deque queue = new ArrayDeque<Integer>();
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        count++;
        queue.add(val);
        int tail = count > size ? (int)queue.poll() : 0;
        
        sum = sum - tail + val;
        
        return (double)sum / Math.min(size, count);
        
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */