class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0){
            return false;
        }
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }

        Arrays.sort(hand);

        for(int card:hand){
            if(map.get(card)==0){
                continue;
            }

            for(int i=0;i<groupSize;i++){
                int curr=card+i;

                if(!map.containsKey(curr) || map.get(curr)==0
                ){
                    return false;
                }
                map.put(curr,map.get(curr)-1);
            }
        }
        return true;
    }
    
}