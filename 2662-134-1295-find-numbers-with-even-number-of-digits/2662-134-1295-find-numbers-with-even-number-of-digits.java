class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int result=0;
    for(int i=0;i<n;i++){
        int count=0;

        int number=nums[i];

        while(number!=0){
            number=number/10;
            count++;

        }
        if(count%2==0){
            result++;
        }

    }
    return result;
       
    }
}