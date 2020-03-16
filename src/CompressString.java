public class CompressString {
    public static String compressString(String S) {
        if (S.length() < 1) return S;
        StringBuilder sb = new StringBuilder();
        char c = S.charAt(0);
        int strCount = 1;
        for (int i = 1;i < S.length();i++) {
            if (S.charAt(i) == c) {
                strCount++;
            } else {
                sb.append(c);
                sb.append(strCount);
                c = S.charAt(i);
                strCount = 1;
            }
        }
        sb.append(c);
        sb.append(strCount);
        return sb.toString().length() >= S.length() ? S : sb.toString();
    }
}

