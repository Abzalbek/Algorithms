package Array;

import org.junit.Test;

import java.util.Arrays;

public class MoveNegative {


    public int[] move(int[] a) {

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (a[left] >= 0 && a[right] >= 0) {
                right--;
            } else if (a[left] < 0) {
                left++;
            } else if (a[left] >= 0 && a[right] < 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
        return a;
    }

    @Test
    public void test() {
        int[] a = {1, 0, -1, -3, 5,};
        System.out.println(Arrays.toString(a) + " -> " + Arrays.toString(move(a)));
    }

}
