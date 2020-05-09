package Array;

import org.junit.Test;

import java.util.Arrays;

public class ReverseArray {

    public int[] reverse(int[] a) {

        int left, right;
        left = 0;
        right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }

    @Test
    public void test() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));

    }
}
