class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int res[] = new int[nums.length];

        int ptCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                l1.add(nums[i]);
            } else if(nums[i]> pivot) {
                l2.add(nums[i]);
            }
            if (nums[i] == pivot) {
                ptCount++;
            }

        }

        for (int p = 0; p < ptCount; p++) {
            l1.add(pivot);

        }

        int j = 0;

        for (int i = 0; i < l1.size(); i++) {
            res[j++] = l1.get(i);
        }

        for (int k = 0; k < l2.size(); k++) {
            res[j++] = l2.get(k);
        }

        return res;

    }
}