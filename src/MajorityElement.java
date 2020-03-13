public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for (int i:nums) {
            if (count == 0) {
                num = i;
                count++;
            } else {
                if (i != num) {
                    count--;
                } else {
                    count++;
                }
            }
        }
        return num;
    }
}
