class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>map=new HashMap<>();

        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);

        String[]str=new String[names.length];
        int n=heights.length;
        int j=0;
        for(int i=n-1;i>=0;i--){
            str[j++]=map.get(heights[i]);
        }

            return str;

    }
}