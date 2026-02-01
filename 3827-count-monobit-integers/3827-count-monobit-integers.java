class Solution {
    public int countMonobit(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            int bitcnt=Integer.bitCount(i);
            int totalbit=Integer.toBinaryString(i).length();

            if(i==0 || bitcnt==totalbit){
                count++;
            }

        }
        return  count;
    }
}