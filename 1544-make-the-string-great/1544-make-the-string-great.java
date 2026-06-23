class Solution {
    public String makeGood(String s) {
        int n=s.length();

        Stack<Character>stk=new Stack<>();

        for(char ch:s.toCharArray()){
            if(!stk.isEmpty() && Character.toLowerCase(stk.peek())==Character.toLowerCase(ch) && stk.peek()!=ch){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }

        StringBuilder str=new StringBuilder();

        while(!stk.isEmpty()){
            str.append(stk.pop());
        }

        return str.reverse().toString();
    }
}