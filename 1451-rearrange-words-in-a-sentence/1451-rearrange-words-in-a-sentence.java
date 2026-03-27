class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] arr=text.split(" ");
        int m=arr.length;

        Arrays.sort(arr,(a,b)->a.length()-b.length());
        StringBuilder str=new StringBuilder();

        str.append(arr[0]).append(" ");
        str.setCharAt(0,Character.toUpperCase(str.charAt(0)));

       for(int i=1;i<arr.length;i++){
        str.append(arr[i]).append(" ");
       }
        str.deleteCharAt(str.length()-1);


        return str.toString();

    }
}