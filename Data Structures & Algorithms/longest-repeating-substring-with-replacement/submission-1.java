class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left=0, right=0, fMax=0, res=0;
        for(right=0; right<s.length(); right++){
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0) + 1);
            fMax = Math.max(fMax, hm.get(s.charAt(right)));

            while(right-left+1 - fMax > k){
                hm.put(s.charAt(left), hm.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
