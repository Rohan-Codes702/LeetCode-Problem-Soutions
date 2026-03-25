class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int minrow=Integer.MAX_VALUE;
            int colidx=0;
            for (int j = 0; j < matrix[0].length; j++) {
               if(matrix[i][j]<minrow){
                minrow=matrix[i][j];
                colidx=j;
               }
            }

            int maxcol=Integer.MIN_VALUE;

            for(int k=0;k<n;k++){
                maxcol=Math.max(maxcol,matrix[k][colidx]);
            }
            if(minrow==maxcol){
                list.add(minrow);
            }
        }
        return list;
    }
}