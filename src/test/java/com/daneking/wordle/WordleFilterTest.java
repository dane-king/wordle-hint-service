package com.daneking.wordle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordleFilterTest {

    @Test
    void shouldFindAWord() {
        WordleFilter wordFinder = new WordleFilter();
        String word="";
        List<String> matches = wordFinder.findMatches(word);
        assertEquals("stock", matches.get(0));
    }
    @Test
    void shouldFind2Words() {
        WordleFilter wordFinder = new WordleFilter();
        String word="";
        List<String> matches = wordFinder.findMatches(word);
        assertEquals(2, matches.size());
    }
    @Test
    void shouldFindMatch2Words() {
        WordleFilter wordFinder = new WordleFilter();
        String word="sto";
        List<String> matches = wordFinder.findMatches(word);
        assertEquals(1, matches.size());
    }


}