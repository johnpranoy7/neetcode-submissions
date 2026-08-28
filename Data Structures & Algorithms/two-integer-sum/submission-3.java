class Solution {
    public int[] twoSum(int[] nums, int target) {
        // value, position
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if( hm.containsKey(target - nums[i]) ){
                int temp = hm.get(target - nums[i]);
                return new int[]{temp, i};
            }
            hm.put(nums[i], i);
        }
        return new int[0];
    }
}
