class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxdist=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(colors[i]!=colors[n-1]){
                maxdist=Math.max(maxdist,n-1-i);
            }
        }

         for(int i=n-1;i>=0;i--){
            if(colors[i]!=colors[0]){
                maxdist=Math.max(maxdist,i);
            }
        }

        return maxdist;
    }
}