class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        int []sq=new int[n];
        
        for(i=0;i<n;i++)
        {
            sq[i]=nums[i]*nums[i];
            
        }
        
        Arrays.sort(sq);
        return sq;
    }
}