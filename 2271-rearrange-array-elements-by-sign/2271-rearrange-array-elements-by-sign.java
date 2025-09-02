class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int res[]=new int[n];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                list1.add(nums[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                list2.add(nums[i]);
            }
        }

        for(int i=0;i<list1.size();i++){
            res[i*2]=list1.get(i);
            res[i*2+1]=list2.get(i);

        }
        return res;

    }
}