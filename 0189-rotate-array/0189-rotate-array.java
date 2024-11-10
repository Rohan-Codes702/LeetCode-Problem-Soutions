class Solution {
    private void reverse(int nums[], int sPos, int ePos)
    {
        while(sPos < ePos)
        {
            int temp = nums[sPos];
            nums[sPos] = nums[ePos];
            nums[ePos] = temp;
            sPos++;
            ePos--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}