import java.util.*;

public class FindContinuousSequence {
    public static int[][] findContinuousSequence(int target) {
        int a1 = Integer.MAX_VALUE;
        int n = 2;
        List<int[]> list = new LinkedList<>();
        while(a1 > 0) {
            int tempRes = (target - n*(n-1) / 2);
            if (tempRes % n == 0) {
                a1 =  tempRes / n;
                if (a1 <= 0) break;
                int[] temp = new int[n];
                for (int i=0;i < n;i++) {
                    temp[i] = a1 + i;
                }
                list.add(temp);
                n++;
            } else {
                n++;
                continue;
            };
        }
        int[][] result = new int[list.size()][];
        for (int i = 0;i < list.size();i++) {
            result[i] = list.get(list.size() - i - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findContinuousSequence(9));
    }
}
