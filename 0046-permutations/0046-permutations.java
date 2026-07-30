class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        boolean []used=new boolean[n];
        backtrack(nums,ans,new ArrayList<>(),used);

        return ans;


    }
    public static void backtrack(int nums[],List<List<Integer>>ans,List<Integer>temp,boolean used[]){

        if(temp.size()==nums.length){
            ans.add(new ArrayList(temp));
        }

        for(int i=0;i<nums.length;i++){

            if(used[i])
                continue;
            
            used[i]=true;
            temp.add(nums[i]);

            backtrack(nums,ans,temp,used);

            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}