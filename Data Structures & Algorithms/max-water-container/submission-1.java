class Solution {
    public int maxArea(int[] heights) {
        int left=0, right=heights.length-1;
        int area = 0, height = 0;
        while(left<right){
            height = Math.min(heights[left], heights[right]);
            area = Math.max( area, height * (right-left));
            if(heights[left]<heights[right])
                left++;
            else
                right--;
        }
        return area;
    }
}
