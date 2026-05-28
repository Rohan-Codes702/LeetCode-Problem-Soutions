class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);

        int i=0;
        int j=n-1;
        long pr=0;
        int sum=skill[i]+skill[j];
        while(i<=j){
            if(skill[i]+skill[j]==sum){
                pr+=skill[i]*skill[j];

                i++;
                j--;
            }
            else{
                return -1;
            }
        }
        return pr;
    }
}