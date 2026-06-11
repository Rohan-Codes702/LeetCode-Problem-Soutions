class MinStack {
    Stack<int[]> stk;

    public MinStack() {
        stk = new Stack<>();
    }

    public void push(int value) {
        if(stk.isEmpty()){
            stk.push(new int[]{value,value});
        }
        else{
            int currentMin=Math.min(value,stk.peek()[1]);
            stk.push(new int[]{value,currentMin});
        }
    }

    public void pop() {
        if (!stk.isEmpty()) {
            stk.pop();
        }

    }

    public int top() {
        if (!stk.isEmpty()) {
             return stk.peek()[0];
        }
        return -1;
    }

    public int getMin() {
    if (stk.isEmpty()) {
        return -1;
    }

    return stk.peek()[1];
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */