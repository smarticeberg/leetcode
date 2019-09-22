package com.jarvis._30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
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

        // 将所有移动分为N类情况
        for (int j = 0; j < wordLength; j++) {
            Map<String, Integer> wordExistMap = new HashMap<String, Integer>();

            int num = 0; // 记录当前wordExistMap中有多少个单词，每次移动一个单词长度
            for (int i = j; i < s.length() - length * wordLength + 1; i = i + wordLength) {
                boolean hasRemoved = false; // 防止情况三移除后，情况一继续移除
                while (num < length) {
                    String word = s.substring(i + num * wordLength, i + (num + 1) * wordLength);

                    if (wordsMap.containsKey(word)) {
                        Integer wordCount = wordExistMap.getOrDefault(word, 0);
                        wordExistMap.put(word, wordCount + 1);

                        // 出现情况三 遇到了符合的单词，但是次数超了
                        if (wordExistMap.get(word) > wordsMap.get(word)) {
                            hasRemoved = true;
                            int removeCount = 0;

                            // 一直移除单词，直到次数符合
                            while (wordExistMap.get(word) > wordsMap.get(word)) {
                                String firstWord = s.substring(i + removeCount * wordLength, i + (removeCount + 1) * wordLength);
                                int value = wordExistMap.get(firstWord);
                                wordExistMap.put(firstWord, value - 1);
                                removeCount++;
                            }
                            num = num - removeCount + 1;// 加1是因为我们把当前单词加入到了wordExistMap中
                            i = i + (removeCount - 1) * wordLength; // 如情况二描述，考虑最外层for循环
                            break;
                        }
                        //出现情况二，遇到了不匹配的单词，直接将 i 移动到该单词的后边（但其实这里
                        //只是移动到了出现问题单词的地方，因为最外层有 for 循环， i 还会移动一个单词
                        //然后刚好就移动到了单词后边）
                    } else {
                        wordExistMap.clear();
                        i = i + num * wordLength;
                        num = 0;
                        break;
                    }
                    num++;
                }

                if (num == length) {
                    result.add(i);
                }

                // 出现情况一，子串完全匹配，我们将上一个子串的第一个单词从wordExistMap中移除
                if (num > 0 && !hasRemoved) {
                    String firstWord = s.substring(i, i + wordLength);
                    int value = wordExistMap.get(firstWord);
                    wordExistMap.put(firstWord, value - 1);
                    num = num - 1;
                }
            }
        }


        return result;
    }
}
