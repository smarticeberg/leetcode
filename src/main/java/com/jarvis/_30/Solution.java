package com.jarvis._30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        int length = words.length;
        if (length == 0) {
            return result;
        }

        // exist effective words.
        int wordLength = words[0].length();

        // HashMap which store the word and count mappings.
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = wordsMap.getOrDefault(word, 0);
            wordsMap.put(word, count + 1);
        }

        // traversing the given string.
        for (int i = 0; i < s.length() - length * wordLength + 1; i++) {
            // store the word which in the current substring.
            Map<String, Integer> wordsExistMap = new HashMap<String, Integer>();

            int num = 0;
            while (num < length) {
                String word = s.substring(i + num * wordLength, i + (num + 1) * wordLength);

                // is this word in wordsMap?
                if (wordsMap.containsKey(word)) {
                    int wordsExistCount = wordsExistMap.getOrDefault(word, 0);
                    wordsExistMap.put(word, wordsExistCount + 1);

                    // existmap count equals to the allwords map count.
                    if (wordsExistMap.get(word) > wordsMap.get(word)) {
                        break;
                    }
                } else {
                    break;
                }
                num++;
            }

            if (num == length) {
                result.add(i);
            }
        }
        return result;
    }
}
