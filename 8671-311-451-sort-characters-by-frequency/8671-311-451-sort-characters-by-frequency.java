class Solution {
    public String frequencySort(String s) {
        int n=s.length();
    HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){

            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }

        }

        StringBuilder str=new StringBuilder();

        while(!map.isEmpty()){

            char maxchar=0;
            int maxfreq=0;
        for(char key:map.keySet()){
            if(map.get(key)>maxfreq){
                maxfreq=map.get(key);
                maxchar=key;
            }
         }   

        

        for(int i=0;i<maxfreq;i++){
            str.append(maxchar);
        }

        map.remove(maxchar);
        }

        return str.toString();
    }
}