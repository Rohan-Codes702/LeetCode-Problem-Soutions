class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";

        }
        HashMap<Character,Integer>need=new HashMap<>();
        HashMap<Character,Integer>window=new HashMap<>();

        for(char ch:t.toCharArray()){
            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        int minLen=Integer.MAX_VALUE;
        int required=need.size();

        int left=0;
        int right=0;
        int start=0;
        int matched=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(need.containsKey(ch) && need.get(ch).intValue()==window.get(ch).intValue()){
                matched++;
            }

            while(left<=right && matched==need.size()){
                if(right-left+1 <minLen){
                    minLen=right-left+1;
                    start=left;
                }

                char leftchar=s.charAt(left);
                window.put(leftchar,window.get(leftchar)-1);

                if(need.containsKey(leftchar) && window.get(leftchar)<need.get(leftchar)){
                    matched--;
                }
                left++;
                
            }
            right++;

        }

        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLen);
    }
}