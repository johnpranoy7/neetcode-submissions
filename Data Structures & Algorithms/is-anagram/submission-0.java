class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCountArray = new int[26];
        int[] tCountArray = new int[26];

        if(s.length()!=t.length())
            return false;

        for(int i=0; i<s.length(); i++)
        {
            sCountArray[s.charAt(i)-'a']++;
            tCountArray[t.charAt(i)-'a']++;
        }

        for(int i=0;i<sCountArray.length;i++){
            if(sCountArray[i]!=tCountArray[i])
                return false;
        }
        return true;
    }
}
