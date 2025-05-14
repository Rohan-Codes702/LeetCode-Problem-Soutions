class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();


        while (n > 0) {
        int digit = n % 10;
        list.add(digit);
         n /= 10;

    }

    Collections.sort(list);

   int a=list.size()-1;
    int b=list.size()-2;
   return list.get(a)* list.get(b);
    

    }
}