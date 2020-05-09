package Array;

import org.junit.Test;

public class HighestInteger {


    public int findHighestNumber(int[] a) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    @Test
    public void test() {
        int[] a = {1, 3, 56, 78, 2, 9, 7, 6, 12};
        System.out.println("max: " + findHighestNumber(a));
    }
}
