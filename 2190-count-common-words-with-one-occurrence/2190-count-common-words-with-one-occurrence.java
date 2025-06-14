class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>map=new HashMap<>();
        int n=words1.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(words1[i])){
                map.put(words1[i],map.get(words1[i])+1);
            }
            else{
                map.put(words1[i],1);
            }
        }

         HashMap<String,Integer>map1=new HashMap<>();
        int n1=words2.length;

        for(int i=0;i<n1;i++){
            if(map1.containsKey(words2[i])){
                map1.put(words2[i],map1.get(words2[i])+1);
            }
            else{
                map1.put(words2[i],1);
            }
        }
    int count=0;
        for(int i=0;i<n;i++){
            if(map.get(words1[i])==1 && map1.containsKey(words1[i]) && map1.get(words1[i])==1)
            {
                
                    count++;
                
            }
        }

return count;
    }
}