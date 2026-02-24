class Solution {
    public int prefixConnected(String[] words, int k) {
        int n=words.length;
        int count=0;
        HashMap<String,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
             if (words[i].length() < k) {
                continue;
            }
            String str=words[i].substring(0,k);

            map.put(str,map.getOrDefault(str,0)+1);
        }

        for(int value:map.values()){
            if(value>=2){
                count++;
            }
        }
        return count;
    }
}