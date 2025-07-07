class Solution {
    public int[] numberOfPairs(int[] nums) {
       int n=nums.length ;
       int count=0;
    HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<n;i++){
        if(set.contains(nums[i])){
                set.remove(nums[i]);
                count++;
        }
        else{
            set.add(nums[i]);
        }
       }

       int result[]=new int [2];
       result[0]=count;
       result[1]=set.size();

       return result;
    }
}