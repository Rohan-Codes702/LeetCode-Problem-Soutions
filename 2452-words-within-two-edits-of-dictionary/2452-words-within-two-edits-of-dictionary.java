class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n1=queries.length;
        int n2=dictionary.length;

        List<String>list=new ArrayList<>();

        for(int i=0;i<n1;i++)
        {
           
            String str=queries[i];
            char chr[]=str.toCharArray();
           
            for(int j=0;j<n2;j++){
                 int count=0;
                char ch[]=dictionary[j].toCharArray();
             
                if(ch.length==chr.length){
                    for(int k=0;k<ch.length;k++){
                        if(chr[k]!=ch[k]){
                            count++;
                        }
                    }
                }
                if(count<=2){
                    list.add(queries[i]);
                    break;
                }
            }
        }

        return list;
    }
}