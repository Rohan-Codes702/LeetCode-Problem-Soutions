class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> stk = new Stack();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {

                if (stk.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && stk.peek() != '(') || (ch == '}' && stk.peek() != '{')
                        || (ch == ']' && stk.peek() != '[')) {
                    return false;
                }
                stk.pop();
            }

        }
        return stk.isEmpty();

    }
}