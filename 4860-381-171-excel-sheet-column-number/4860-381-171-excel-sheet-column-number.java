class Solution {
    public int titleToNumber(String col) {
        int result=0;

        for(int i=0;i<col.length();i++){
            char c=col.charAt(i);

            int val=c-'A'+1;
            result=result*26+val;
        }
        return result;
    }
}