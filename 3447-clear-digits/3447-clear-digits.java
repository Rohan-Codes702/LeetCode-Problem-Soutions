class Solution {
    public String clearDigits(String s) {
        int n=s.length();
                Stack<Character>stk=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
            
              }
                Stack<Character>res=new Stack<>();

              while(!stk.isEmpty()){

                res.push(stk.pop());
                }

        

        StringBuilder str=new StringBuilder();

        while(!res.isEmpty()){
            str.append(res.pop());
        }

        return str.toString();

    }
}