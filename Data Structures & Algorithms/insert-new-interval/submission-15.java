class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       ArrayList<int[]> res = new ArrayList<>();

        int n = intervals.length;
        int i=0;
       //before ins
       while(i<n && intervals[i][1]<newInterval[0]){
        res.add(intervals[i]);
        i++;
       }

       //check and adjust overlap
       while(i<n && intervals[i][0]<=newInterval[1]){
        newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
        newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
        i++;
       }
       res.add(newInterval);

       //add after elements
       while(i<n){
        res.add(intervals[i]);
        i++;
       }

       return res.stream().toArray(int[][]::new);
    }
}
