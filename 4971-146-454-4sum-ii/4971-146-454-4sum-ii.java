class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){

                int sum=nums1[i]+nums2[j];

                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }
                else{
                    map.put(sum,1);
                }


            }
        }

            for(int k=0;k<nums3.length;k++){
                for(int l=0;l<nums4.length;l++){
                    int target=-(nums3[k]+nums4[l]);

                    if(map.containsKey(target)){
                        count=count+map.get(target);

                    }
                }
            }

        return count;
    }
}

