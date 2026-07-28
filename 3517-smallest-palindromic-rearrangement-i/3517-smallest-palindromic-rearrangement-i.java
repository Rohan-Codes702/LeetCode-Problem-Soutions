class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        HashMap<Character,Integer>map=new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder left=new StringBuilder();
        char middle='\0';

        for(char ch='a';ch<='z';ch++){
            int count=map.getOrDefault(ch,0);

            for(int i=0;i<count/2;i++){
                left.append(ch);
            }
            if(count%2==1){
                middle=ch;
            }
        }
        StringBuilder right=new StringBuilder(left).reverse();

        if(middle=='\0'){
            return left.toString()+right.toString();
        }
        return left.toString()+middle+right.toString();
    }
}
