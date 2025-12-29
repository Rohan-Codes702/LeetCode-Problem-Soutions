class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left=0;
        int c0=0;
        int c1=0;
        int result=0;

        for(int right=0;right<s.length();right++){
                char ch=s.charAt(right);

                if(ch=='0'){
                    c0++;
                }
                else{
                    c1++;
                }

                while(c1>k && c0>k){
                    if(s.charAt(left)=='0'){
                        c0--;
                    }
                    else{
                        c1--;
                    }
                    left++;
                }
                result+=right-left+1;
        }
        return result;
    }
}