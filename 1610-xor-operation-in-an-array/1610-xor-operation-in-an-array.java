class Solution {
    public int xorOperation(int n, int start) {
    int nums[]=new int [n];

    for(int i=0;i<n;i++){
        nums[i]=start+2*i;
    }

    int ans=0;
    for(int i=0;i<nums.length;i++){
        ans^=nums[i];
    }

    return ans;
    }
}