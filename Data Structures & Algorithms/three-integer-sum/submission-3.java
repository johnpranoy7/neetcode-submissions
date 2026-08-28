class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int left=0, right=nums.length-1;
        int target=0;
        for(int i=0;i<nums.length;i++){
            target = -nums[i];
            if(nums[i]>0)           //If all 3 nums are positve the sum will never be 0
                break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            left = i+1; right = nums.length-1;
            while(left<right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;                 //There could be multiple combinations. Lets check until left<right fails
                }
                if(nums[left]+nums[right]> -nums[i] || nums[right]==nums[right-1])
                    right--;
                else if(nums[left]+nums[right] < -nums[i] || nums[left]==nums[left+1])
                    left++;
            }
        }
        return new ArrayList(res);
    }
}