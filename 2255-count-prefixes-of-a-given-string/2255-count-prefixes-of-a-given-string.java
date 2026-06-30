class Solution {
    public int countPrefixes(String[] words, String s) {

        HashMap<String,Integer> map = new HashMap<>();

        for (String i : words) {
           map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int right=1;right<=s.length();right++){
            String st=s.substring(0,right);

            if(map.containsKey(st)){
                count+=map.get(st);
            }
            
        }
        return count;
    }
}