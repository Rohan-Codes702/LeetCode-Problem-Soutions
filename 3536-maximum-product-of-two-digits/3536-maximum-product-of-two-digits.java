class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();

        while(n!=0){
            int rem=n%10;
            list.add(rem);
            n=n/10;
        }
        Collections.sort(list);

       int n1=list.get(list.size()-1);
       int n2=list.get(list.size()-2);
        return n1*n2;
    }
}