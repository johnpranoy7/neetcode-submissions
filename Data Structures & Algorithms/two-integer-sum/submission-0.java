class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Two pointer Method
        for(int i=0, j=nums.length-1 ;i<j; i++ ){
            while(i<j)
            {    if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
                else{
                    j--;
                }
            }
            j=nums.length-1;
        }
        return null;
    }
}
