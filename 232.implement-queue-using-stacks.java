public class MyQueue {
    private Stack<Integer> stack;
    private Iterator<Integer> queueIterator;
    private Integer cached;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        queueIterator = null;
        cached = null;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (cached != null) {
            final int temp = cached;
            cached = null;
            return temp;
        } else if (queueIterator != null) {
            final int temp = queueIterator.next();
            if (!queueIterator.hasNext()) {
                queueIterator = null;
            }
            return temp;
        } else {
            queueIterator = stack.iterator();
            stack = new Stack<>();
            return pop();
        }        
    }
    
    /** Get the front element. */
    public int peek() {
        if (cached != null) {
            return cached;
        } else if (queueIterator != null) {
            cached = pop();
            return cached;
        } else {
            return stack.iterator().next();
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return cached == null && queueIterator == null && stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
