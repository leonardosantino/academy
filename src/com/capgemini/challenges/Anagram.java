package com.capgemini.challenges;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public int findNumberAnagrams(String word) {

        HashMap<String, Integer> mapSubstring = new HashMap<>();

        int anagramPairs = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {

                char[] chars = word.substring(i, j + 1).toCharArray();
                Arrays.sort(chars);

                String substring = String.valueOf(chars);

                if (mapSubstring.containsKey(substring))
                    mapSubstring.put(substring, mapSubstring.get(substring) + 1);
                else
                    mapSubstring.put(substring, 1);
            }
        }

        for (int value : mapSubstring.values()) {
            anagramPairs += (value % 2 == 0) ? value / 2 : (value - 1) / 2;
        }
        return anagramPairs;
    }
}
