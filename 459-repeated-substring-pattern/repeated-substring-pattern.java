class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String t=s+s;
        String sub=t.substring(1,t.length()-1);
        return sub.contains(s);

        
    }
}