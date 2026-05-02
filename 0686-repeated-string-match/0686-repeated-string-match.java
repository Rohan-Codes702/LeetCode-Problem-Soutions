class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder  str=new StringBuilder();
        int count=0;

        while(str.length()<b.length()){
            str.append(a);
            count++;
        }

        if(!str.toString().contains(b)){
            count++;
            str.append(a);
        }

        if(str.toString().contains(b)){
            return count;
        }
        return -1;
    }
}