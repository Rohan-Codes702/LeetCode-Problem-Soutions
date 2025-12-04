class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

       int []arr=new int[citations.length];
        int j=0;
       for(int i=citations.length-1;i>=0;i--){
        arr[j]=citations[i];
        j++;
       }

        int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>=i+1){
            count++;
        }
        else{
            return count;
        }
       }
        return count;
        
    }
}