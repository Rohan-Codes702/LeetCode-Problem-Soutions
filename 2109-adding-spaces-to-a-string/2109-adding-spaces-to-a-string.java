class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();

        char ch []=s.toCharArray();
        Arrays.sort(spaces);
        int index=0;
        for(int i=0;i<ch.length;i++){
           if(index<spaces.length && spaces[index]==i){
            str.append(" ");
            index++;
           }
            str.append(ch[i]);
        }
        return str.toString();
    }
}