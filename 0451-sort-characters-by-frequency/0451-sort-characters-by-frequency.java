class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        StringBuilder str=new StringBuilder();

        while(!map.isEmpty()){
            int freq=0;
            char ch=0;

            for(char key:map.keySet()){
                    if(map.get(key)>freq){
                        freq=map.get(key);
                        ch=key;
                    }
            }
            for(int i=0;i<freq;i++){
                str.append(ch);
            }
            map.remove(ch);
        }


return str.toString();
    }
}