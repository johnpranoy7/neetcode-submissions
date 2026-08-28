class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0, j=nums.length-1; i<j; ){
           while(i<j){
            if(nums[i]==nums[j])
                return true;
            j--;
           }
           i++;j=nums.length-1;
        }
        return false;
    }
}
