class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int left=0;
        int right=n-1;
        int maxResult=0;
        while(left<=right){
            int width=right-left;
            int ht=Math.min(height[right],height[left]);
            int area=width*ht;

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            maxResult=Math.max(maxResult,area);
        }
        return maxResult;
    }
}