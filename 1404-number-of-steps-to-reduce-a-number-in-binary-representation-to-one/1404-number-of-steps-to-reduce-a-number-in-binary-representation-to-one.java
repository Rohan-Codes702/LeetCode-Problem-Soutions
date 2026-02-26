class Solution {
    public int numSteps(String s) {
        int steps=0;
        int carray=0;

        for(int i=s.length()-1;i>0;i--){
            int bit=s.charAt(i)-'0'+carray;

            if(bit==1){
                steps+=2;
                carray=1;
            }
            else{
                steps+=1;
            }
        }
        return steps+carray;
    }
}