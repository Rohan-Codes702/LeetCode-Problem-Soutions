class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m=capacity.length;

        Arrays.sort(capacity);
        int total=0;
        for(int i:apple){
            total+=i;
        }

        int count=0;
        int sum=0;
        for(int i=m-1;i>=0;i--){
            sum+=capacity[i];
            count++;
            if(sum>=total){
                return count;
            }
        }

        return -1;


    }
}