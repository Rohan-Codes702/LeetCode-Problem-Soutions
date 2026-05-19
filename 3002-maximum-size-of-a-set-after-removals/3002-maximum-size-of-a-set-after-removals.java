class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        int n1 = nums1.length;
        int n2 = nums2.length;

       
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i ++) {
           set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i ++) {
            set2.add(nums2[i]);
        }

        int take1 = Math.min(set1.size(), n1 / 2);
        int take2 = Math.min(set2.size(), n2 / 2);

        set.addAll(set1);
        set.addAll(set2);

        return Math.min(set.size(), take1 + take2);
    }
}