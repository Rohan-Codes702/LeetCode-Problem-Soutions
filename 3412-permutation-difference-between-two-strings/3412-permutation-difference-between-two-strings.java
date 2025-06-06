class Solution {
    public int findPermutationDifference(String s, String t) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            int indx2=t.indexOf(ch);
            sum+=Math.abs(i-indx2);
          
        }
        return sum;
    }
}