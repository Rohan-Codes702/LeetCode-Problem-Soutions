class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        int []arr=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i)-'0';
        }

        while(arr.length>2){
            int []next=new int [arr.length-1];

            for(int i=0;i<next.length;i++){
                int res=(arr[i]+arr[i+1])%10;

                next[i]=res;

            }
            arr=next;
        }

        return arr[0]==arr[1];
    }
}