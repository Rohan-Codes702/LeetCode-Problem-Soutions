class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        long sum=0;
        int count=0;
            
          for(int i=n-1;i>=0 &&count<k;i--){
            int val=happiness[i]-count;

            if(val>0){
                sum+=val;
                count++;
            }

        }
        return sum;

    }
}