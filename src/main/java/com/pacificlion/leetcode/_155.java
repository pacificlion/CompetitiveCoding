package com.pacificlion.leetcode;

/**
 * 155. Min Stack
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. getMin() -- Retrieve the minimum
 * element in the stack.
 * 
 * 
 * Example:
 * 
 * MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
 * minStack.push(-3); minStack.getMin(); --> Returns -3. minStack.pop();
 * minStack.top(); --> Returns 0. minStack.getMin(); --> Returns -2.
 * 
 * @author pacificlion
 *
 */
public class _155 {
	public static class MinStack {

	    /** initialize your data structure here. */
	    
	    int top;
	    int min=Integer.MAX_VALUE;
	    MinStack child;
	    public MinStack() {
	        
	    }
	    
	    public MinStack(int top, int min, MinStack child){
	        this.top = top;
	        this.min = min;
	        this.child = child;
	    }
	    
	    public void push(int x) {
	        child = new MinStack(top,min, child);
	        top = x;
	        if(min >x) min=x;
	    }
	    
	    public void pop() {
	        if(child== null){return;}
	       top = child.top;
	        min = child.min;
	        child = child.child;
	        
	    }
	    
	    public int top() {
	        return top;
	    }
	    
	    public int getMin() {
	        return min;
	    }
	}

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
}
