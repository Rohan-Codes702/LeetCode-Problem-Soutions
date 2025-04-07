class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length * grid.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int val=grid[i][j];
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
    }

        int result[]=new int [2];
        int missing=-1;
        int repete=-1;

        for(int i=0;i<=n;i++){
           if(!map.containsKey(i)){
            missing=i;

           }
           else if(map.get(i)==2){
            repete=i;
           }
        }
        result[0]=repete;
        result[1]=missing;
        return result;
    }
}