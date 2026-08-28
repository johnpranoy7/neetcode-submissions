class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int maxCount = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){   //While executes only when sequece starts. We are cutting down unnecessary while loop executions from middle of sequence.
                count = 1;
                while(hs.contains(nums[i]+count)){
                    count++;
                }
                if(count>maxCount)
                    maxCount = count;   //update maxCount val
            }
        }
        return maxCount;
    }
}
