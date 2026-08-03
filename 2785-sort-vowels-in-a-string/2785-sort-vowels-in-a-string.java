class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        ArrayList<Character>list=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                list.add(ch);
            }
        }

        Collections.sort(list);
        int k=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

             if((ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U')&& k<=list.size()){
                str.append(list.get(k));
                k++;
             }
             else{
                str.append(ch);
             }
        }

        return str.toString();
    }
}