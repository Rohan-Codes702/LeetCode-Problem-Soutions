class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int elesum=0;
        int digiysum=0;

        for(int i=0;i<n;i++){
            elesum+=nums[i];

        }

        for(int i=0;i<n;i++){
            int num=nums[i];
             while (num > 0) {
                digiysum += num % 10;  
                num /= 10; 
            }
            
        }

        int result=Math.abs(elesum)-Math.abs(digiysum);

        return result;
    }
}