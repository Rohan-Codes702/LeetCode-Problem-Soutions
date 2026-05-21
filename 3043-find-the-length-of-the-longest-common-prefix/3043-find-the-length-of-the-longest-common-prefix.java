class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;

        HashSet<String>set=new HashSet<>();
        int ans=0;
        for(int i:arr1){
            String s=String.valueOf(i);

            for(int j=0;j<=s.length();j++){
                String prefix=s.substring(0,j);

                set.add(prefix);
            }
        }

        for(int i:arr2){
            String s=String.valueOf(i);

            for(int j=0;j<=s.length();j++){
                String prefix=s.substring(0,j);

                if(set.contains(prefix)){
                    ans=Math.max(ans,j);
                }
            }
        }
        return ans;

    }
}