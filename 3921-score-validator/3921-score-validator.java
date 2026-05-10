class Solution {
    public int[] scoreValidator(String[] events) {
        int[]res=new int[2];
        int n=events.length;

        int score=0;
        int counter=0;

        for(int i=0;i<n;i++){
            String ch=events[i];

            if("W".equals(ch)){
                counter+=1;
                if(counter==10){
                    break;
                }
                
            }
            else if("WD".equals(ch) || "NB".equals(ch) ){
                score+=1;
            }
            else{
                score+=Integer.parseInt(ch);
            }
        }
        res[0]=score;
        res[1]=counter;

        return res;
    }

}