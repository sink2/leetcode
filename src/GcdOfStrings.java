public class GcdOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        int maxLen = Math.min(str1.length(), str2.length());
        for (int i = maxLen - 1;i >= 0;i--) {
            if (str1.length() % (i + 1) == 0 && str2.length() % (i + 1) == 0) {
                if (checkSubStr(str1, str2.substring(0, i + 1)) && checkSubStr(str2, str2.substring(0, i + 1))) {
                    return str1.substring(0, i + 1);
                }
            }
        }
        return "";
    }

    public static boolean checkSubStr(String str, String subStr) {
        for (int i = 0;i <= str.length() - subStr.length();i += subStr.length()) {
            if (!str.substring(i, i + subStr.length()).equals(subStr)) {
                return false;
            }
        }
        return true;
    }
}
