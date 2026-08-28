class Solution {
    public boolean isAnagram(String s, String t) {
        //countArray
        int[] cntArray = new int[26];

        //nomarlise to smallcase
        s = s.toLowerCase();
        t = t.toLowerCase();
        for(int i=0;i<s.length();i++){
            cntArray[ s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            cntArray[t.charAt(i) - 'a']--;
        }

        return Arrays.stream(cntArray).distinct().count() > 1 ? false : true;
    }
}
