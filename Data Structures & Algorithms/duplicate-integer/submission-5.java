class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Arrays and sorting
        // Arrays.sort(nums); // N^2 +  nLOG(n) + N
        // for(int i=0;i<nums.length - 1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }

        //HashSet
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        
        return false;
    }
}