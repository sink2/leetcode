import java.util.ArrayList;
import java.util.List;

public class convert {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        List<StringBuilder> sbs = new ArrayList<>(numRows);
        for (int i = 0;i < numRows;i++) {
            sbs.add(new StringBuilder());
        }
        int currentIndex = 0;
        int carry = 1;
        for (int i = 0;i < s.length();i++) {
            sbs.get(currentIndex).append(s.charAt(i));
            if (currentIndex >= numRows - 1) {
                carry = -1;
            }
            if (currentIndex == 0) {
                carry = 1;
            }
            currentIndex += carry;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < sbs.size();i++) {
            if (sbs.get(i) == null) break;
            sb.append(sbs.get(i));
        }
        return sb.toString();
    }
}
