class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        int []res=new int[2];

        if(n==1 && indexDifference==0 && valueDifference==0){
            res[0]=0;
            res[1]=0;
            return res;
        }
        res[0]=-1;
        res[1]=-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                int ab=Math.abs(i-j);
                int ab2=Math.abs(nums[i]-nums[j]);

                if((ab>=indexDifference)&& (ab2>=valueDifference))
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }

              
            }
                
            }
                    return res;

        }
    }
