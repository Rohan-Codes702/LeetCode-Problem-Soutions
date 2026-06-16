class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            boolean add=true;

            while(!st.isEmpty() && st.peek() > 0 && asteroids[i] <0 )
        
            if ( st.peek() <Math.abs(asteroids[i])) {
                st.pop();
            }
            else if(st.peek() == Math.abs(asteroids[i])){
                st.pop();
                add=false;
                break;
            }
            else{
                add=false;
                break;
            }
           if(add){
            st.push(asteroids[i]);
        }
        }
        
        int[] res = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.get(i);
        }
        return res;
    }
}