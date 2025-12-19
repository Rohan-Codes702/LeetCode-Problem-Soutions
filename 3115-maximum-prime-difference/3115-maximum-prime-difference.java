class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int arr[]=new int [nums.length];
        int n=arr.length;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(isprime(nums[i])){
                arr[j]=i;
                j++;
            }
        }
        return arr[j-1]-arr[0];

    }
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}