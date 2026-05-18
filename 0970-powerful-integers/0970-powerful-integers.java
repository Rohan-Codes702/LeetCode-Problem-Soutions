class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                int power=(int)(Math.pow(x,i)+Math.pow(y,j));
                if(power<=bound){
                    set.add(power);
                }
            }
        }
        return new ArrayList<>(set);
    }
}