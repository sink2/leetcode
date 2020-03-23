/**
 * No.12
 * 整数转罗马数字
 */
public class IntToRoman {
    public static String intToRoman(int num) {
        int[] romanNum = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanStr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<romanNum.length;i++) {
            int currentVal = num / romanNum[i];
            if (currentVal != 0) {
                while (currentVal > 0) {
                    sb.append(romanStr[i]);
                    currentVal--;
                }
            }
            num = num % romanNum[i];
        }
        return sb.toString();
    }
}
