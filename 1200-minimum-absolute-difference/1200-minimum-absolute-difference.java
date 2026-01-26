class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>list=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);

        int min=Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++){
            int max=arr[i+1]-arr[i];

            if(max<min){
                min=max;
                list.clear();
            }

            if(max==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
           
        }
        return list;


    }
}