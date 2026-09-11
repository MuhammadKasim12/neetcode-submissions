class MinStack {

    private Stack stack;
    private Stack minStack;
    private int minValue;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        minValue=Integer.MIN_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= (int) minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return (int) stack.peek();
    }
    
    public int getMin() {
        return (int) minStack.peek();
    }
}
