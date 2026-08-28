class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0, right = 1, maxLength=0;
        char[] charArr = s.toCharArray();
        if(charArr.length>0){
            hs.add(s.charAt(left));
            maxLength=1;
        }
        while(right<s.length()){
            if(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;             // remove char and reduce sliding window to keep only uniq ele
            }else{
                hs.add(s.charAt(right));
                right++;
            }
            maxLength = Math.max( hs.size(), maxLength);
        }
        return maxLength;
    }
}
