class Solution {
    public String reverseWords(String s) {
        String[] arr =s.split("\\s+");
        

        
        int i=0;
        int j=arr.length-1;
        
        while(i<=j)
        {
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
         StringBuilder sb=new StringBuilder();
        
        for( i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }
        
        return sb.toString().trim();

        
    }
}