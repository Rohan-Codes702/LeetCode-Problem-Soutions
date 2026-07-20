class Solution {
    public String rearrangeString(String s, char x, char y) {
        int n=s.length();
        String str="";
        int countx=0;
        int county=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(c==x){
                countx++;
            }
            else if(c==y){
                county++;
            }
            else{
                str+=c;
            }
        }

        while(county!=0){
            sb.append(y);
            county--;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            sb.append(ch);
        }
         while(countx!=0){
            sb.append(x);
            countx--;
        }

        return sb.toString();




    }
}