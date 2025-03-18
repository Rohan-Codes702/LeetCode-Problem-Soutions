class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        for(int i=left;i<=right;i++){
            boolean find=false;
            for(int j=0;j<ranges.length;j++){

                if(ranges[j][1]>=i && ranges[j][0]<=i){
                    find=true;
                    break;
                }

            }
            if(!find){
                return false;
            }
        }
        return true;
    }
}