class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
      HashSet<Integer>set=new HashSet<>();

      for(int i=0;i<nums1.length;i++){
        set.add(nums1[i]);
      }

        int minvalue=Integer.MAX_VALUE;
      for(int j=0;j<nums2.length;j++){
        if(set.contains(nums2[j]))
        {
           minvalue=Math.min(minvalue,nums2[j]);
        }
      }
     if(minvalue==Integer.MAX_VALUE){
        return -1;
     }
     return minvalue;
    }
}