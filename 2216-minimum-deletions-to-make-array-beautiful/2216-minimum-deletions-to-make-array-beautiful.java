class Solution {
    public int minDeletion(int[] nums) {
        int count = 0;

        Stack<Integer> stk = new Stack<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
           if(stk.size()%2==0){
            stk.push(nums[i]);
           }
           else{
            if(stk.peek()==nums[i]){
                count++;
            }
            else{
                stk.push(nums[i]);
            }
           }
        }

        if(stk.size()%2!=0){
            count++;
        }
        return count;
    }
}