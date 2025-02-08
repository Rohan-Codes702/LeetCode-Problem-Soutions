class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        int i,j;

        for(i=1;i<matrix.length;i++){

            for(j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}