class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int sum=0;
        for(int i=start;i<destination;i++){
             sum+=distance[i];
        }
            int tsum=0;
        for(int i=0;i<distance.length;i++){
             tsum+=distance[i];
        }

        int result=tsum-sum;
        return Math.min(result,sum);
        

    }
}