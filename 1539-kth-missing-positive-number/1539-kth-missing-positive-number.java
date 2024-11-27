class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        
        int st=0;
        int end=arr.length-1;
        
        while(st<=end)
        {
            int mid=(st+end)/2;
            
            if(arr[mid]-mid-1<k)
            {
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return st+k;
    }
}