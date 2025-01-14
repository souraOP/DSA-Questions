class MyStack {
    public Queue<Integer> qq;
    public MyStack() {
        this.qq = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        qq.add(x);
        for(int i = 0; i < qq.size() - 1; i++){
            qq.add(qq.poll());
        }
    }
    
    public int pop() {
        return qq.poll();
    }
    
    public int top() {
        return qq.peek();
    }
    
    public boolean empty() {
        return qq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */