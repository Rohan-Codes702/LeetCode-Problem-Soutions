class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int[] ans = new int[nums.length];

        arr1[0] = nums[0];
        int k = 1;
        arr2[0] = nums[1];
        int j = 1;
        for (int i = 2; i < nums.length; i++) {
            if (arr1[k-1] > arr2[j-1]) {
                arr1[k++] = nums[i];
            } else {
                arr2[j++] = nums[i];
            }
        }
        int a = 0;
        for (int i = 0; i < k; i++) {
            ans[a++] = arr1[i];
        }
        for (int i = 0; i < j; i++) {
            ans[a++] = arr2[i];
        }
        return ans;
    }
}