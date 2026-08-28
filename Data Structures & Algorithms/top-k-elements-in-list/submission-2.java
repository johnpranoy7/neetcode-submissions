class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        // ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> res = 
        new PriorityQueue<>( Comparator.comparing(Map.Entry::getValue) );
        // PriorityQueue<Map.Entry<Integer,Integer>> res =
        // new PriorityQueue<>( Comparator.comparingInt(Map.Entry::getValue));


        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            res.add(entry);
            if(res.size()>k)
                res.poll();
        }

        return res.stream().map(entry->entry.getKey()).mapToInt(Integer::intValue).toArray();

        // // for(Map.Entry<Integer,Integer> i : hm.entrySet()){
        // //     if(i.getValue() >= k){
        // //         res.add(i.getKey());
        // //     }
        // // }

        // return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
