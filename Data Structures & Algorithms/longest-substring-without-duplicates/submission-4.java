class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left=0, right=1;
        int maxSize=0;
        char[] charArray = s.toCharArray();
        if(charArray.length>0){
            hs.add(s.charAt(left));
        }
        while(right<s.length()){
            if(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }else{
                hs.add(s.charAt(right));
                right++;
            }
            maxSize = Math.max(maxSize, hs.size());
        }
        maxSize = Math.max(maxSize, hs.size());
        return maxSize;
    }
}
