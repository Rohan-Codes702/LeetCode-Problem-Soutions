class Solution {
    public int minChanges(int n, int k) {
        int count=0;
        
          while(n>0 || k>0){
                int bitn=n&1;
                int bitk=k&1;

                if(bitn==1 && bitk==0){
                count++;
            }
            if(bitn==0 && bitk==1){
                return -1;
            }

            n=n>>1;
            k=k>>1;
        }
    
       
        return count;
    }
}