public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if(s.length() < 1) return s;
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < s.length();i++) {
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append('#');
        String str = sb.toString();
        int index = 0;
        int maxLen = 0;
        for (int i=0;i<str.length();i++) {
            int step = 0;
            for(int j = 0;j < Math.min(i, str.length() - i - 1) + 1;j++) {
                if (str.charAt(i-j) == str.charAt(i + j)) {
                    step++;
                } else {
                    break;
                }
            }
            if (step > maxLen) {
                index = i;
                maxLen = step;
            }
        }
        return str.substring(index - (maxLen - 1), index + (maxLen)).replaceAll("#","");
    }
}
