class Solution {
    public void setZeroes(int[][] matrix) {
       int m=matrix.length;
       int n=matrix[0] .length;

        HashSet<Integer>rowset=new HashSet<>();
        HashSet<Integer>colset=new HashSet<>();

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
               rowset.add(i);
               colset.add(j);
            }
        }
       }

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            
            if(rowset.contains(i)||colset.contains(j))
            {
                matrix[i][j]=0;
            }
        }
       }


    }
}