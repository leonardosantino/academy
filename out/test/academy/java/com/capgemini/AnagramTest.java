package com.capgemini;

import com.capgemini.challenges.Anagram;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    private final Anagram anagram = new Anagram();

    @Test
    @DisplayName("Anagram = 'ifailuhkqq' return 3")
    void findNumberAnagrams() {
        assertEquals(3, anagram.findNumberAnagrams("ifailuhkqq"));
    }

    @Test
    @DisplayName("Anagram = 'vovo' return 3")
    void findNumberAnagrams1() {
        assertEquals(3, anagram.findNumberAnagrams("vovo"));
    }

    @Test
    @DisplayName("Anagram = 'ovo' return 2")
    void findNumberAnagrams2() {
        assertEquals(2, anagram.findNumberAnagrams("ovo"));
    }

    @Test
    @DisplayName("Anagram = 'aa' return 1")
    void findNumberAnagrams3() {
        assertEquals(1, anagram.findNumberAnagrams("aa"));
    }

    @Test
    @DisplayName("Anagram = 'ab' return 0")
    void findNumberAnagrams4() {
        assertEquals(0, anagram.findNumberAnagrams("ab"));
    }

    @Test
    @DisplayName("Anagram = '' return 0")
    void findNumberAnagrams5() {
        assertEquals(0, anagram.findNumberAnagrams(""));
    }
}
