class Solution {
    public String makeFancyString(String s) {
        int n=s.length();

     StringBuilder str=new StringBuilder();
     int count=1;

     for(int i=0;i<n;i++){
        if(i==0){
            str.append(s.charAt(i));
        }
        else{
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }

            if(count<3){
                str.append(s.charAt(i));
            }
        }
     }

     return str.toString();



    }
}