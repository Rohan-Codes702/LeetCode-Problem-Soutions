class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stk=new Stack();

     for(char ch:s.toCharArray()){

        if(!stk.isEmpty() && stk.peek()==ch){
            stk.pop();
        }
        else{
            stk.push(ch);
        }
     }

     StringBuilder str=new StringBuilder();

     for(char ch:stk){
        str.append(ch);
     }

     return str.toString();
    }
}