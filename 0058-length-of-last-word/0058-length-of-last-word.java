class Solution {
    public int lengthOfLastWord(String s) {
        boolean a=false;
        int b=0;
        for (int i=s.length()-1; i>=0; i--) {
            if (a==false && s.charAt(i)==' ') {
                continue;
            } else if (a==false && s.charAt(i)!=' ') {
                b++;
                a=true;
            } else if (a==true && s.charAt(i)!=' ') {
                b++;
            } else if (a==true && s.charAt(i)==' ') {
                break;
            }
        }
        return b;
    }
}