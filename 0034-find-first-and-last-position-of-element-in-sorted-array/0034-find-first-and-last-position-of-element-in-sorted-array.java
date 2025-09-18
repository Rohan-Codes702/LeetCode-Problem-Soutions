class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = { -1, -1 };

        int i = 0;
        int n = nums.length;
        int j = n - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] == target) {

                int left = mid;
                int right = mid;

                while (left - 1 >= 0 && nums[left - 1] == target) {
                    left--;
                }

                while (right + 1 < n && nums[right + 1] == target) {
                    right++;
                }

                res[0]=left;
                res[1]=right;
                
                return res;

            }

            else if (target > nums[mid]) {
               i=mid+1;

            } else {
                j=mid-1;
            }
        }

        return res;

    }
}