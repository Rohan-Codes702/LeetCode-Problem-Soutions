class Solution {
    public String reverseWords(String s) {
      String[] arr = s.split(" ");
      
        
        StringBuilder sb=new StringBuilder(); 
        
        for(int i=0;i<arr.length;i++)
        {
            char[]w=arr[i].toCharArray();
            int j=0;
            int k=arr[i].length()-1;
            while(j<=k){
            char temp=w[j];
            w[j]=w[k];
            w[k]=temp;
                j++;
                k--;
            }
                
            sb.append(new String(w)).append(" ");
        }

        
        
    String st=sb.toString().trim();
        return st;
        
        
    }
}