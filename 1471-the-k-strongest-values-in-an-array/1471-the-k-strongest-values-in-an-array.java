class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int[]res=new int[k];
        int middle=(n-1)/2;
        int s=0;
        int i=0;
        int j=n-1;
        
        while(i<=j && s<k){
            int left=Math.abs(arr[i]-arr[middle]);
            int right=Math.abs(arr[j]-arr[middle]);
            if(left>right || (left==right && arr[i]>arr[j])){
               res[s++]=arr[i];
               i++;
            }
            else{
                res[s++]=arr[j];
                j--;
            }
        
        }
        return res;
    }
}