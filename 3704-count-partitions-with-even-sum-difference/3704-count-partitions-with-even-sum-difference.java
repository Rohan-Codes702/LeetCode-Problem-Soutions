class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int count=0;

        for(int i=0;i<n-1;i++){
           int s1=0;
            for(int j=0;j<=i;j++){
               s1+=nums[j];
    

            }

            int s2=0;

            for(int k=i+1;k<n;k++){
                s2+=nums[k];
            }

            int sub=s1-s2;

            if(sub%2==0){
                count++;
            }


        }
        return count;

       
    }
}