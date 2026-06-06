class Solution {
    public int countCollisions(String directions) {
        int n=directions.length();
        if(n==1){
            return 0;
        }
        int l=0;
        int r=n-1;

        while(l<r && directions.charAt(l)=='L'){
            l++;
        }
        while(l<r && directions.charAt(r)=='R'){
            r--;
        }

        if(l>=r){
            return 0;
        }
        int count=0;

        for( int i=l; i<=r;i++){
            if(directions.charAt(i)!='S'){
                count++;
            }
        }
        return count;
    }
}