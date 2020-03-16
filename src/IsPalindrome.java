public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;
        int newNum = 0;
        while(newNum < x) {
            newNum = newNum * 10 + x % 10;
            x = x / 10;
        }
        return newNum == x || newNum / 10 == x;
    }
}
