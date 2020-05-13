package Array;

import org.junit.Test;

public class SmallestNumber {

    private int smallestInt(int[] a) {

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        return smallest;
    }

    /*
      second smallest
     */

    private int secondSmallest(int[] a) {
        int first, second;
        first = second = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < first) {
                second = first;
                first = a[i];
            } else if (a[i] < second && a[i] != first) {
                second = a[i];
            }
        }
        return second;
    }

    @Test
    public void test() {
        int[] a = {-3, 2, 34, 6, -8, 10};
        System.out.println("First smalles: " + smallestInt(a));
        System.out.println("Second smalles: " + secondSmallest(a));

    }
}
