class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> myStack = new Stack<>();
        int j = 0;
        for(int i : pushed){
            myStack.push(i);
            while(!myStack.isEmpty() && myStack.peek() == popped[j]){
                myStack.pop();
                j++;
            }
        }
        return myStack.isEmpty();
    }
}