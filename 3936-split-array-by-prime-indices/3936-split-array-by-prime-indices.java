class Solution {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public long splitArray(int[] nums) {
        int n=nums.length;
        int []a=new int[n];
        int []b=new int [n];
        long sumA=0;
        long sumB=0;

        for(int i=0;i<n;i++){
            if(isPrime(i)){
                a[i]=nums[i];
                sumA+=nums[i];
            }
            else{
                b[i]=nums[i];
                sumB+=nums[i];
            }
        }
        long result=Math.abs(sumA-sumB);
        return result;
    }

}