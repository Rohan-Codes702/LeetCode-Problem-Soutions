class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        int max=nums[n-1];
        for(int i=0;i<n;i++){
            int number=nums[i];
            while(number!=max){
                number++;
                count++;
            }
                
            
        }
        return count;
    }
}