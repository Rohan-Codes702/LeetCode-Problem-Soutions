class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int i;
        int re[]=new int[n+1];
        re[0]=0;
        int alti=0;
        
        for(i=0;i<n;i++){
            alti=alti+gain[i];
            re[i+1]=alti; 
        }
        Arrays.sort(re);
        return re[n];

    }
}