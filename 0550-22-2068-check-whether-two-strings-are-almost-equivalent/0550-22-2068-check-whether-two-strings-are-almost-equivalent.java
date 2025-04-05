class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer>map1=new HashMap<>();

        for(int i=0;i<word1.length();i++){
            char ch1=word1.charAt(i);


            if(map1.containsKey(ch1)){
                map1.put(ch1,map1.get(ch1)+1);
            }
           
            else
            {
                map1.put(ch1,1);
            }
            
        }

        for(int i=0;i<word2.length();i++){
            char ch2=word2.charAt(i);

             if(map1.containsKey(ch2)){
                map1.put(ch2,map1.get(ch2)-1);
            }
            else{
                map1.put(ch2,-1);

            }


        }

       

        for(int i:map1.values()){
            if(Math.abs(i)>3){
                return false;
            }
        }
        return true;





    }
}