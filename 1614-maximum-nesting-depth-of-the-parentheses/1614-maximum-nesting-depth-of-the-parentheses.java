class Solution {
    public int maxDepth(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
            int open=0;
            int close=0;

            if(ch!=')' || ch!='('){
                for(int j=0;j<i;j++){
                    if(s.charAt(j)=='('){
                        open++;
                    }
                    else if(s.charAt(j)==')'){
                        close++;
                    }
                }
            }
            ans=Math.max(ans,(Math.abs(open-close)));
        }
        return ans;
    }
}