public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int startFlag = 0;
        for (int i = 0;i < s.length();i++) {
            if (s.substring(startFlag, i).indexOf(s.charAt(i)) != -1) {
                result = Math.max(result, i - startFlag);
                startFlag = s.indexOf(s.charAt(i), startFlag) + 1;
            }
        }
        return Math.max(result, s.length() - startFlag);
    }
}
