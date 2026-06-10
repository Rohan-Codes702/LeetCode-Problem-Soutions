class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int n = pushed.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            stk.push(pushed[i]);
            while (!stk.isEmpty() && stk.peek() == popped[idx]) {
                stk.pop();
                idx++;
            }

        }
        return stk.isEmpty();
    }
}