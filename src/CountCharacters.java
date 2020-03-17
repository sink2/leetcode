/**
 * No.1160
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 */
public class CountCharacters {
    public static int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] charArray = new int[26];
        for (int i=0;i<chars.length();i++) {
            int index = chars.charAt(i) % 'a';
            charArray[index]++;
        }
        loop: for (String s : words) {
            int[] wordArray = new int[26];
            for (char c : s.toCharArray()) {
                int index = c % 'a';
                wordArray[index]++;
            }
            for (int i=0;i<charArray.length;i++) {
                if (wordArray[i] > charArray[i]) continue loop;
            }
            result += s.length();
        }
        return result;
    }
}