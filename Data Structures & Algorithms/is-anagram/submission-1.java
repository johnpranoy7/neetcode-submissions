class Solution {

public boolean isAnagram(String s, String t) {
    //Count Array Approach
    int[] aCntArray = new int[26];
    int[] bCntArray = new int[26];

    if(s.length()!=t.length())
        return false;
    
    //Inserting values
    for(int i=0; i<s.length();i++)
    {
        aCntArray[s.charAt(i)-'a']++;
        bCntArray[t.charAt(i)-'a']++;
    }

    for(int i=0;i<aCntArray.length;i++){
        if(aCntArray[i]!=bCntArray[i])
            return false;
    }
    return true;

}






















    // public boolean isAnagram(String s, String t) {
    //     int[] sCountArray = new int[26];
    //     int[] tCountArray = new int[26];

    //     if(s.length()!=t.length())
    //         return false;

    //     for(int i=0; i<s.length(); i++)
    //     {
    //         sCountArray[s.charAt(i)-'a']++;
    //         tCountArray[t.charAt(i)-'a']++;
    //     }

    //     for(int i=0;i<sCountArray.length;i++){
    //         if(sCountArray[i]!=tCountArray[i])
    //             return false;
    //     }
    //     return true;
    // }
}
