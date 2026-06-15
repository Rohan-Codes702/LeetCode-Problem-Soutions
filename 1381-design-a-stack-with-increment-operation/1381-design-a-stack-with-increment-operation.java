class CustomStack {
    Stack <Integer> stk;
    int maxSize;
    public CustomStack(int maxSize) {
        stk=new Stack<>();
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(maxSize>stk.size()){
            stk.push(x);
        }
    }
    
    public int pop() {
        if(!stk.isEmpty()){
           return stk.pop();
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,stk.size());i++){
            stk.set(i,stk.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */