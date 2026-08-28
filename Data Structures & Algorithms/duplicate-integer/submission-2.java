class Solution {

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]))
                return true;
            else
                hs.add(nums[i]);
        }
        return false;
    }

    // public boolean hasDuplicate(int[] nums) {
    //     for(int i=0, j=nums.length-1; i<j; ){
    //        while(i<j){
    //         if(nums[i]==nums[j])
    //             return true;
    //         j--;
    //        }
    //        i++;j=nums.length-1;
    //     }
    //     return false;
    // }
}
