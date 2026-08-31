class Solution {
    public void sortColors(int[] nums) {
        
        int n=nums.length;
        int one=0;
        int two=0;
        int zero=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int s=0;
        while(zero!=0){
            nums[s]=0;
            zero--;
            s++;
        }
        while(one!=0){
            nums[s]=1;
            one--;
            s++;
        }
        while(two!=0){
            nums[s]=2;
            two--;
            s++;
        }

    }
}