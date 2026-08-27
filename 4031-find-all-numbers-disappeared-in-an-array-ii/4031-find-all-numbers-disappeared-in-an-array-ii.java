class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int i = lower;

        while (i <= upper) {
            if (set.contains(i)) {
                i++;
                continue;
            }
            int start = i;

            while (i <= upper && !set.contains(i)) {
                i++;
            }
            int end = i - 1;

            result.add(Arrays.asList(start, end));
        }

        return result;
    }
}