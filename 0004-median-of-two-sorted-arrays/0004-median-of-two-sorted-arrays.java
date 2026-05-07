class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];
        int j = 0;
        for (int i : nums1) {
            arr[j++] = i;
        }
        for (int i : nums2) {
            arr[j++] = i;
        }

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        }

        return (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;
    }
}