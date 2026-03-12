class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int freq:map.values()){
            if(freq==0){
                continue;
            }
            if(freq<3){
                ans+=freq;
            }
            else{
                if(freq%2==0){
                    ans+=2;
                }
                else{
                    ans+=1;
                }
            }
        }
        return ans;
    }
}