class Solution {
    public int countNegatives(int[][] arr) {
      int count =0;
      
      for(int i=0; i<arr.length; i++)
      {
    	  if(arr[i][0]<0) {
    		  count += arr[i].length;
    		  continue;
    	  }
    	  count += binarysearch(arr[i]);
      }
      return count;  
    }

    public static int binarysearch(int[] arr) {
	int c=0;
	int start=0;
    int end=arr.length-1;
	
	while(start<=end)
	{
		int mid = start+(end-start)/2;
	
		if(arr[mid]<0)
		{
		  end=mid-1;
		}
        else{
            start =mid+1;
        }
		
	}
	
	return arr.length-start;
}
	
}