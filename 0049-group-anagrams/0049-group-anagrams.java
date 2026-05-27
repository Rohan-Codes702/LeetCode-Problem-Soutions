class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>>map=new HashMap<>();

        for(int i=0;i<n;i++){
            String str=strs[i];
            char []ch=str.toCharArray();

            Arrays.sort(ch);

            String key=new String(ch);

            if(map.containsKey(key)){
                List<String>temp=map.get(key);

                temp.add(str);

                map.put(key,temp);
            }
            else{
                List<String>temp=new ArrayList<>();

                temp.add(str);

                map.put(key,temp);
            }

        }
        List<List<String>> ans=new ArrayList<>();

        for(List<String> list:map.values()){
            ans.add(list);
        }

        return ans;
        

       
    }
}