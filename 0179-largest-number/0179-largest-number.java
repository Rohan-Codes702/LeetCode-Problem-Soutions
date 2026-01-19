class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String str = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i : nums) {
            list.add(String.valueOf(i));
        }
        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));
        if (list.get(0).equals("0")) {
            return "0";
        }
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }

        return str;
    }
}