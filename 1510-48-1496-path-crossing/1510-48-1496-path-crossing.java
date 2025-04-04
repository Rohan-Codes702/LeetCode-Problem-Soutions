class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String>set=new HashSet<>();
        int x=0,y=0;

        set.add(x+","+y);

        for(char ch:path.toCharArray()){
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }

        

        String str=x+","+y;

        if(set.contains(str)){
            return true;
        }
        set.add(str);
        }

        return false;


    }
}