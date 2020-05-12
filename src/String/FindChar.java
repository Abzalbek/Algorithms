package String;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindChar {


    /*
    Searching char mentioned more that one time
     */

    public void findChars(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chars = str.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    /*
    counting chars in a string
     */
    public void countChars(String str) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    public void test() {
        String str = "Hello World! haha";
        countChars(str);

        findChars(str);
    }
}
