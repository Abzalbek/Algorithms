package Array;

import org.junit.Test;

public class HighestInteger {

/*
searching second highest integer in an array
 */
    public int findHighestNumber(int[] a) {

        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                second=first;
                first = a[i];
            }if(a[i]>second && a[i]!=first){
                second=a[i];
            }
        }
        return second;
    }

    @Test
    public void test() {
        int[] a = {1, 3, 56, 78, 2, 9, 7, 6, 12};
        System.out.println("max: " + findHighestNumber(a));
    }
}
