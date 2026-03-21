class Solution {
    public boolean digitCount(String num) {
        int arr[]=new int [num.length()];

        for(int i=0;i<num.length();i++){
           arr[i] = num.charAt(i) - '0';
        }   

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != map.getOrDefault(i, 0)){
                return false;
            }
        }
        return true;
    }
}