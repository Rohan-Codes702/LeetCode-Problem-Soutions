class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=0;

        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                if(i!=j && arr[i]== (2*arr[j]) )
                {
                    return true;
                }
            }
        }
        return false;
    }
}