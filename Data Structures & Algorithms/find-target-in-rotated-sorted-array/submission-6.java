class Solution {
public static int search(int[] nums, int target) {
        int start=0, end=nums.length-1, mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[start]==target)
                return start;
            else if(nums[mid]==target)
                return mid;
            else if(nums[end]==target)
                return end;
            if(nums[start]<nums[mid]){
                if(nums[start]<target && target<nums[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }else{
                if(nums[mid]<target && target<nums[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}
