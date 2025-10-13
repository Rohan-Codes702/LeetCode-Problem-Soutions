class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>list=new ArrayList<>();
        int n=words.length;
        list.add(words[0]);
        for(int i=1;i<n;i++){
            char []ch1=words[i].toCharArray();
            char []ch2=words[i-1].toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(!Arrays.equals(ch1,ch2)){
                list.add(words[i]);
            }

            
        }
        return list;
    }
}