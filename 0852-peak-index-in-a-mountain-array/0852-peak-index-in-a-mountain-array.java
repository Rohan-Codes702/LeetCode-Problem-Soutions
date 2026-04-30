class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;

        int i=0;
        int j=n-1;

        while(i<j){
            int mid=(i+j)/2;

            if(mid>0 && mid<n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }

        }
        return i;
    }
}
