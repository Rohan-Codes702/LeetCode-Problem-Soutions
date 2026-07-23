class Solution {
    public int[] closestDivisors(int num) {

        int[] n1 = helper(num + 1);
        int[] n2 = helper(num + 2);

        int diff1 = Math.abs(n1[0] - n1[1]);
        int diff2 = Math.abs(n2[0] - n2[1]);

        if(diff2>diff1){
            return n1;
        }
        return n2;

    }

    private int []helper(int n){
        int root=(int)Math.sqrt(n);

        for(int i=root;i>=0;i--){
            if(n%i==0){
                return new int[]{i,n/i};
            }
        }
        return new int[]{1,n};
    }
}