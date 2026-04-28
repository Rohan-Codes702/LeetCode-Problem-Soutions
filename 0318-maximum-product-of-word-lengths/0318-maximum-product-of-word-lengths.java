class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int max=0;
        for(int i=0;i<n-1;i++){

            char[]ch=words[i].toCharArray();
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<ch.length;j++){
                set.add(ch[j]);
            }

            for(int j=i+1;j<n;j++){
                boolean common=false;

                char[]chr=words[j].toCharArray();

                for(int p=0;p<chr.length;p++){
                    if(set.contains(chr[p])){
                        common=true;
                        break;
                    }
                }

                if(!common){
                    int product=words[i].length()*words[j].length();
                    max=Math.max(product,max);
                }
            }


        }
        return max;
    }
}