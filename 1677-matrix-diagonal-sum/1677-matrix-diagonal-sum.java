class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int prisum=0;
        int secsum=0;
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if(i==j){
            prisum+=mat[i][j];
        }
        else if(j==n-1-i)
        secsum+=mat[i][j];

        }
    }
    return prisum+secsum;
}
}