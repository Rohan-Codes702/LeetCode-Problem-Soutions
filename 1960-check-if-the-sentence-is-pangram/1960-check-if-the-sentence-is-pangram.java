class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=sentence.charAt(i);

            if(ch>='a' && ch<='z'){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        }

    
        return map.size()==26;
    }
}