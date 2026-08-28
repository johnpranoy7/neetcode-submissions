class Solution {
    public boolean isAnagram(String s, String t) {
        //frequence count
        int[] freqCnt = new int[26];
        if(s.length() != t.length())
            return false;

        for(int i=0;i<s.length();i++){
            freqCnt[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<t.length();i++){
             freqCnt[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<26;i++){
            if(freqCnt[i]>0)
                return false;
        }

        return true;

    }
}
