package com.jarvis._30;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void testFindSubstring1() {
        Solution solution = new Solution();
        List<Integer> result = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        System.out.println(result);
    }

    @Test
    public void testFindSubstring2() {
        Solution solution = new Solution();
        List<Integer> result = solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        System.out.println(result);
    }

}
