class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[]res=new int[n];

        Stack<Integer>stk=new Stack<>();

        for(int i=n-1;i>=0;i--){
            int count=0;
            while(!stk.isEmpty() && stk.peek()<=heights[i]){
                stk.pop();
                count++;
            }
            if(!stk.isEmpty()){
                count++;
            }
            res[i]=count;
            stk.push(heights[i]);
        }
        return res;
    }
}