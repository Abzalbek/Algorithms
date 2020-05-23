package Array;

import org.junit.Test;

import java.util.HashSet;

public class Find_none_dupe {

    /*
    Given an array of integers where every integer occurs three times except for one integer,
    which only occurs once, find and return the non-duplicated integer.
    For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
    Do this in O(N) time and O(1) space.
     */


    public int findNoneDupe(int[] a) {

        HashSet<Integer> hashSet = new HashSet<>();

        // Adding elements to hashset
        for (int i : a) {
            hashSet.add(i);
        }

        // Sum of array element
        int sum_array = 0;
        for (int i : a) {
            sum_array += i;
        }

        // Sum of hashset elements{
        int sum_hashset = 0;
        for (int i : hashSet) {
            sum_hashset += i;
        }

        return (3 * sum_hashset - sum_array) / 2;
    }

    @Test
    public void test() {
        int a[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 100};
        System.out.println("none dupe is " + findNoneDupe(a));
    }
}
