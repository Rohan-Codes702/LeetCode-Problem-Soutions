class Solution {
    public int minimumCost(int[] cost) {
        int []arr=new int[cost.length];
        Arrays.sort(cost);
        int j=0;
        for(int i=cost.length-1;i>=0;i--){
            arr[j++]=cost[i];
        }
        int idx=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(idx!=3){
                sum+=arr[i];
                
            }
            idx++;
            if(idx>3){
                idx=1;
            }
        }
        return sum;
    }
}