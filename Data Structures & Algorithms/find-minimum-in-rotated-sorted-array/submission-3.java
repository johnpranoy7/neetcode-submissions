class Solution {
    public int findMin(int[] nums) {
        int start=0, end=nums.length-1, mid=0, min=Integer.MAX_VALUE;
        if(nums.length==1)
            return nums[0];
        while(start<=end){
            mid=(start+end)/2;
            //First half sorted in asc
            if(nums[start]<nums[mid]){
                min = Math.min(nums[start],min);
                start = mid+1;
            }
            //Second half is sorted in asc
            else if(nums[mid]<nums[end]){
                min = Math.min(nums[mid],min);
                end = mid-1;
            }
            //Else case when start==mid || mid==end
            else {
                if(nums[end]<nums[start])
                    min = Math.min(nums[end],min);
                else if(nums[start]==nums[end])
                    min = Math.min(nums[end],min);
                return min;
            }
        }
        return min;
    }
}
