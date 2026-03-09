class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);

            int rev = 0;
            int temp=nums[i];
            while (temp!= 0) {
                int rem = temp % 10;
                rev =rev*10+rem;
                temp = temp / 10;
            }
            set.add(rev);
        }
        return set.size();
    }
}