class Solution {
    public double[] internalAngles(int[] sides) {
        double[]res=new double[3];

        Arrays.sort(sides);
        if(sides[0]+sides[1]>sides[2]){
            double a=sides[0];
            double b=sides[1];
            double c=sides[2];

            double A=Math.acos((b*b +c*c -a*a)/(2*b*c))*180/Math.PI;
            double B=Math.acos((a*a +c*c -b*b)/(2*a*c))*180/Math.PI;
            double C=Math.acos((b*b +a*a -c*c)/(2*b*a))*180/Math.PI;

            res[0]=A;
            res[1]=B;
            res[2]=C;
        }
        else{
            return new double[0];
        }
        
        return res;
    }
}