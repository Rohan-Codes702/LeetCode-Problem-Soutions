class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int mindist=Integer.MAX_VALUE;
       

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
               mindist=Math.min(mindist,i-map.get(nums[i]));
            }
            map.put(reverse(nums[i]),i);
        }

        if(mindist==Integer.MAX_VALUE){
            return -1;
        }
        return mindist;
    }
    public static int reverse(int n){
        int num=0;
        int sign=n<0?-1:1;
         n=Math.abs(n);
        while(n!=0){
            int rem=n%10;
             num=num*10+rem;
            n=n/10;
        }
        return num*sign;
    }
}