public class CanThreePartsEqualSum {
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int value : A) {
            sum += value;
        }
        if (sum % 3 != 0) return false;
        int targetVal = sum / 3;
        sum = 0;
        int countDown = 3;
        for (int value : A) {
            sum += value;
            if (sum == targetVal) {
                sum = 0;
                countDown--;
            }
        }
        return countDown <= 0;
    }
}
