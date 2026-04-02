class Solution {
    public boolean areNumbersAscending(String s) {
        int n=s.length();

        String str[]=s.split("\\s+");
        int res=0;
        for(int i=0;i<str.length;i++){
            if(isnumber(str[i])){
                int num=Integer.parseInt(str[i]);

                if(num>res){
                    res=num;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isnumber(String ch){
        try{
            Integer.parseInt(ch);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}