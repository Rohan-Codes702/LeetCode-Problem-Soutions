class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == ')') {
                StringBuilder str = new StringBuilder();
                while (stk.peek()!= '(') {
                    str.append(stk.pop());

                }
                stk.pop();

                for (int i = 0; i < str.length(); i++) {
                    stk.push(str.charAt(i));
                }

            } else {
                stk.push(c);
            }

        }

        StringBuilder ans = new StringBuilder();

        while (!stk.isEmpty()) {
            ans.append(stk.pop());
        }

        return ans.reverse().toString();

    }
}