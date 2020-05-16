package String;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Run-length encoding is a fast and simple method of encoding strings.
 * The basic idea is to represent repeated successive characters as a single
 * count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
 * <p>
 * Implement run-length encoding and decoding. You can assume the string to be encoded
 * have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid
 */
public class DecodeString {

    // wrong version
    private StringBuffer countChars(String str) {

        StringBuffer sb = new StringBuffer();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            sb.append(entry.getValue()).append(entry.getKey());
        }

        return sb;
    }


    // more accurate

    private String codeString(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        char currchar = str.charAt(0);
        int count = 1;
        String result = "";

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == currchar) {
                count++;
            } else {
                result = result + count + currchar;

                //reset
                currchar = ch;
                count = 1;
            }
        }
        result = result + count + currchar;
        return result;
    }

    @Test
    public void test() {
        String str = "AAAABBBCCDAA";
        System.out.println(codeString(str));
    }
}
