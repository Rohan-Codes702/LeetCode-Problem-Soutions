class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;

        Arrays.sort(arr);

        int num=(n*5)/100;
        int sum=0;
        for(int i=num;i<n-num;i++){
            sum+=arr[i];
        }

        double result=sum/(double)(n-num*2);
        return result;
    }
}