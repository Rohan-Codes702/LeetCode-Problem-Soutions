class Solution {
    public int arrayNesting(int[] nums) {
        int logestlength=Integer.MIN_VALUE;
        int n=nums.length;
        boolean[]visited=new boolean[nums.length];

        for(int i=0;i<n;i++){

            if(!visited[i]){
                int count=0;
                int j=i;

                while(!visited[j]){
                    visited[j]=true;
                    j=nums[j];
                    count++;
                }

                logestlength=Math.max(logestlength,count);

            }

        }
        return logestlength;
    }
}