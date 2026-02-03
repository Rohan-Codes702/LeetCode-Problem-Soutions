class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> list = new ArrayList<>();
        int max=0;

        for(int i:candies){
            max=Math.max(max,i);
        }
        for (int i =0; i<n; i++) {
            int res = candies[i] + extraCandies;

            if (res >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;

    }
}