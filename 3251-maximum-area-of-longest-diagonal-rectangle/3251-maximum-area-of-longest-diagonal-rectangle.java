class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;

        double max=0.0;
        int a=0;
        for(int []i:dimensions){
            int l=i[0];
            int r=i[1];

            double sq=Math.sqrt((double) l * l + (double) r * r);
            int area=l*r;

            if(sq>max ||((sq==max)&& (area>a))){
                max=sq;
                a=area;

            }
            
        }
        return a;
    }
}