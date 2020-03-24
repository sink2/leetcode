/**
 * No.13
 * 罗马数字转整数
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        int[] romanNum = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanStr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        int romanIndex = 0;
        int result = 0;
        while (index < s.length()) {
            String str = s.substring(index, Math.min(index + romanStr[romanIndex].length(), s.length()));
            if (str.equals(romanStr[romanIndex])) {
                result += romanNum[romanIndex];
                index += romanStr[romanIndex].length();
            } else {
                romanIndex++;
            }
        }
        return result;
    }
}
