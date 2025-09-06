class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binarysearch(nums, 0, n - 1, target);

    }

    public int binarysearch(int[] nums, int l, int h, int target) {
        if (l > h) {
            return -1;
        }

        int mid = (l + h) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        else if (target <nums[mid]) {
           return binarysearch(nums, l, mid-1,target);
        } else {
           return binarysearch(nums, mid + 1, h,target);
        }
    }
}