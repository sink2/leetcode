import java.util.Arrays;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class GetLeastNumbers {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k > arr.length) return null;
        int[] result = new int[k];
        quickSort(arr, 0, arr.length - 1);
        for (int i=0;i<result.length;i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void quickSort(int[] arr, int l, int r) {
        int mid = arr[(l + r) / 2];
        int i = l;
        int j = r;
        while (i <= j) {
            while (mid > arr[i]) i++;
            while (mid < arr[j]) j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j) {
            quickSort(arr, l, j);
        }
        if (r > i) {
            quickSort(arr, i, r);
        }
    }
}
