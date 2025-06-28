class Solution {
    public String clearDigits(String s) {
        Stack<Character>stk=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!Character.isDigit(ch)){
                        stk.push(ch);
            }

            else{
                stk.pop();
            }
        }
        StringBuilder str=new StringBuilder();

        for(char ch:stk){
            str.append(ch);

        }
  return str.toString();
    }
}