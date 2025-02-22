class Solution {
    public int averageValue(int[] nums) {
        int ans=0;
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]% 3==0){
                ans=ans+nums[i];
                cnt++;
            
            }

           
    }
    int p=0;
    if(cnt>0)
     p=ans/cnt;
    
    return p;
}
}