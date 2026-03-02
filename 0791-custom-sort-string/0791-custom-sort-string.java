class Solution {
    public String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder newstr = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);

           while(str.toString().contains(String.valueOf(ch))){
             
                newstr.append(ch);
                int idx=str.indexOf(String.valueOf(ch));
                  str.deleteCharAt(idx);

           }
        }
        newstr.append(str);

        return newstr.toString();



    }
}