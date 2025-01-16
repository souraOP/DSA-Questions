class Pair{
    int val;
    int min;
    public Pair(int val, int min){
        this.val = val;
        this.min = min;
    }
}


class MinStack {

    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int minimum;
        if(st.isEmpty()){
            minimum = val;
        } else {
            minimum = Math.min(val, st.peek().min);
        }
        st.push(new Pair(val, minimum));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */