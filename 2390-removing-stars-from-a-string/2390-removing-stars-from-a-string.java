class Solution {
    public String removeStars(String s) {
        int n=s.length();

        Stack<Character>st=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }

        StringBuilder str=new StringBuilder();

        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}