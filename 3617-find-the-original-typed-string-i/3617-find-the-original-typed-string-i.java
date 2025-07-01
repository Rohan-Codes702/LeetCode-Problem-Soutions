class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int count =1;
        for(int i=0;i<n-1;i++){
                char ch1=word.charAt(i);
                char ch2=word.charAt(i+1);

                if(ch2==ch1){
                    count++;
                }
            
        }
        return count;
    }
}