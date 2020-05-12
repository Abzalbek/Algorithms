package Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {


    public int[] moveZeros(int[] a) {

        int right = a.length - 1;
        int left = 0;

        while (left < right) {
            if (a[left] != 0 && a[right] != 0) {
                right--;
            } else if (a[left] == 0) {
                left++;
            } else if (a[left] != 0 && a[right] == 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
        return a;
    }

    @Test
    public void test() {
        int[] a = {1, 0, 2, 3, 5, 6};
        System.out.print(Arrays.toString(a) + " -> " + Arrays.toString(moveZeros(a)));
    }
}
