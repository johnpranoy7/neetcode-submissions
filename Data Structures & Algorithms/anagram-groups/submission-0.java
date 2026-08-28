class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //count Array + hashmap

        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            int[] tempCnt = new int[26];
            String s = strs[i];
            for(int k=0;k< s.length();k++){
                tempCnt[s.charAt(k) - 'a']++;
            }
            String tempCntStr = Arrays.toString(tempCnt);
            hm.putIfAbsent(tempCntStr, new ArrayList());
            hm.get(tempCntStr).add(s);
        }
        return new ArrayList(hm.values());
    }
}
