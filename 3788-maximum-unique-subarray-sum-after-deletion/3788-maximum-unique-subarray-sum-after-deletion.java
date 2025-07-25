class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int sum=0;

        if(n==1){
            return nums[0];
        }
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        ArrayList<Integer>list=new ArrayList<>(set);

        for(int i=0;i<list.size();i++){
            if(list.get(i)>0)
            {
                sum+=list.get(i);
            }
           
        }

        if(sum==0){
            sum=Collections.max(list);
        }
        return sum;
    }
}