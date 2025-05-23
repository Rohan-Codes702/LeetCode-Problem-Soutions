class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sq=0;
        int count=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>set=new HashSet<>();

            for(int j=i;j<n;j++){
                set.add(nums.get(j));
              count=set.size();
              sq+=count*count;


            }
            
        }
        return sq;

        
        
    }
}