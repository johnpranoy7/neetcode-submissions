class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int i=0;
        //neg case
        if(intervals.length<1)
            return new int[][]{{newInterval[0], newInterval[1]}};
        //before elements
        for(i=0; i<intervals.length && intervals[i][0] <= newInterval[0] ; i++){
            res.add(intervals[i]);
        }
        
        //insert new ele by checking overlap
        if(res.size()>0 && res.get(res.size()-1)[1]>=newInterval[0])
            res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], newInterval[1]);
        else
            res.add(newInterval);

        //after ele. Check for overlap and merge else insert
        for(;i<intervals.length;i++){
            if(res.get(res.size()-1)[1] < intervals[i][0] ){
                //no overlap
                res.add(intervals[i]);
            }else{
                //overlap the end window of new ele
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], intervals[i][1]);
            }
        }
        return res.stream().toArray(int[][]::new);
    }
}
