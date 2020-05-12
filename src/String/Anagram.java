package String;

import org.junit.Test;

public class Anagram {

    public boolean isAnagram(String str, String anagram) {

        if (str.length() != anagram.length()) {
            return false;
        }

        char[] given = str.toCharArray();

        for (char ch : given) {
            if (anagram.indexOf(ch) != -1) {
                anagram = anagram.substring(0, anagram.indexOf(ch)) + anagram.substring(anagram.indexOf(ch) + 1);
            } else {
                return false;
            }
        }

        return anagram.isEmpty();
    }

    @Test
    public void test() {

        String str1 = "adfg";
        String str2 = "fagd";

        System.out.println(str1 + " and " + str2 + " are anagrams " + isAnagram(str1, str2));

        String str3 = "fage";
        System.out.println(str1 + " and " + str3 + " are anagrams " + isAnagram(str1, str3));

    }
}
