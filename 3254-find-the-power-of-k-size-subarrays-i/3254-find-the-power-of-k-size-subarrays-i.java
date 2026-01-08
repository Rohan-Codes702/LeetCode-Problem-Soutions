class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int [n-k+1];
        int j=0;
        int l=0;
        int r=k-1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=l;i<=r;i++){
            list.add(nums[i]);
        }
        if(ischeck(list)){
            result[j]=nums[r];
           
        }
        else{
            result[j]=-1;
        }
        j++;
        
        for( r=k;r<n;r++){
            list.remove(0);
            list.add(nums[r]);
            l++;

            if(ischeck(list)){
                result[j]=nums[r];
            }
            else{
                result[j]=-1;
            }
            j++;

        }
        return result;

    }

    public static boolean ischeck(ArrayList<Integer>list){
       
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)!=list.get(i)+1){
                return false;
            }
        }
        return true;
    }
}