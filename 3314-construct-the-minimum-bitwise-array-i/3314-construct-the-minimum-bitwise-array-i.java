class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int []res=new int [n];

        for(int i=0;i<n;i++){
            res[i]=-1;
            int val=nums.get(i);;
            
            for(int x=0;x<=val;x++){
                if((x|(x+1))==val){
                    res[i]=x;
                    break;
                }
                else{
                    res[i]=-1;
                }
            }
        }
        return res;
    }
}