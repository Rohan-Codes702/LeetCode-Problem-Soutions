class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
         int m=matrix.length-1;        
         int n=matrix[0].length;
         int i=0;
         int j=n-1;
        
        while(i<=m && j>=0)
        {
            
            if(matrix[i][j]==target)
            {
                return true;
            }
            
           if(target<matrix[i][j] )
           {
               j--;
           }
            else
            {
                i++;
            }
        }
        
        return false;
    }
}

