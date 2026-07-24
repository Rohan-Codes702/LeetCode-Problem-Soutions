class Solution {
    public int reachNumber(int target) {
         target=Math.abs(target);
        int num=0;
        int moves=0;

        while(num<target || (target-num)%2!=0){
            moves++;
            num+=moves;
        }
        return moves;
    }
}