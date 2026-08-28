class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        //cleanup string
        for(int i=0; i < s.length(); i++){
            if(Character.isLetterOrDigit( s.charAt(i) ))
                sb.append(s.charAt(i));
        }

        s = sb.toString().toLowerCase();
        return s.equals(sb.reverse().toString().toLowerCase());
    }
}
