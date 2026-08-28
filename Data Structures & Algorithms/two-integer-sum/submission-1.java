class Solution {
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap();
    int temp;

    for(int i=0;i<nums.length;i++){
        temp = target-nums[i];

        if(map.containsKey(temp)){
            return new int[]{map.get(temp), i};
        }

        map.put(nums[i],i);
    }
    return null;
}








/*
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
    */
}
