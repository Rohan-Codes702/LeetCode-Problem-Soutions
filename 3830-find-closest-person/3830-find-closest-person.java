class Solution {
    public int findClosest(int x, int y, int z) {
        int s1=Math.abs(z-x);
        int s2=Math.abs(z-y);

        if(s1<s2){
            return 1;
        }
        else if(s1>s2){
            return 2;
        }
        return 0;
    }
}