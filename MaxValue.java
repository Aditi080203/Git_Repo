import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        int[] ar = { 1, 43, 87, 34, 99 };
        System.out.println(max(ar, 2, 3));
        System.out.println(Arrays.toString(ar));
    }

    private static int max(int[] ar, int start, int end) {
        if (end < start)
            return -1;
        if (ar == null)
            return -1;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (max < ar[i])
                max = ar[i];
        }
        return max;
    }

}
