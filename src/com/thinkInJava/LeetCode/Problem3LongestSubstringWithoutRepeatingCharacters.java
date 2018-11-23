package com.thinkInJava.LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem3LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println("maxLength: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int startPos = 0;
        int maxLength = 0;
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterIntegerMap.containsKey(c)) {
                int tempLength = i - startPos;
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                }
                startPos = characterIntegerMap.get(c) + 1;
                characterIntegerMap.put(c, i);
            } else if (i == s.length() - 1) {
                int tempLength = i - startPos + 1;
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                }
            } else {
                characterIntegerMap.put(c, i);
            }
        }
        return maxLength;
    }
}
