class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int lft=(i -startIndex+n)  % n;
                int rgt=(startIndex-i+ n) % n;
                min=Math.min(min,Math.min(lft,rgt));

            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}