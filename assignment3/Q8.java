/*Find if two strings are anagrams, an anagram is a word or phrase formed
by reordering the letters of another word or phrase. Declare two strings
str1 and str2 and initialize. Create a HashMap<Character, Integer>
and use methods containsKey() ,put() ,get() to check the strings */


import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("Strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("Strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            int count = charCountMap.get(c);
            if (count == 1) {
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, count - 1);
            }
        }
        return charCountMap.isEmpty();
    }
}
