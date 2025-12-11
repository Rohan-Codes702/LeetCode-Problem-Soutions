class Solution {
    public boolean checkRecord(String s) {
        int n=s.length();

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int a=0;
        int l=0;
        for(char ch : map.keySet()){
            if(ch == 'A') a = map.get(ch);
            if(ch == 'L') l = map.get(ch);
        }

        if(a>1){
            return false;
        }
            int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='L'){
                count++;

                if(count>2){
                    return false;
                }
            }
            else{
                count=0;
            }
        }
        return true;
    }
}