class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String val = operations[i];

            if (val.equals("X++")) {
                x += 1;
            }     
            else if (val.equals("++X")) {
                x += 1;   
            }
            else if (val.equals("X--")) {
                x -= 1;
            }
            else if (val.equals("--X")) {
                x -= 1;   
            }
        }
        return x;
    }
}
