class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        generate(n, "", list, 0, 0);
        return list;
    }

    public static void generate(int n,String ans,List<String>list,int open,int close){
        if(open>=n && close>=n){
            list.add(ans);
            return;
        }
        if(open<n){
            generate(n,ans+'(',list,open+1,close);
        }
         if(close<open){
            generate(n,ans+')',list,open,close+1);
        }

    }
}