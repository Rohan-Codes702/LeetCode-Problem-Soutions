class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int n = A.length;
        int s = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map1 = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();

            for (int j = 0; j <= i; j++) {
                map1.put(A[j], map1.getOrDefault(A[j], 0) + 1);
            }
            for (int k = 0; k <= i; k++) {
                map2.put(B[k], map2.getOrDefault(B[k], 0) + 1);
            }

            for (int p : map1.keySet()) {
                if (map2.containsKey(p)) {
                    count++;
                }
            }
            res[s++] = count;
            count = 0;
            map1.clear();
            map2.clear();

        }
        return res;
    }
}