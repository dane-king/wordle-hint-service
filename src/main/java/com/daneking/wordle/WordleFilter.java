package com.daneking.wordle;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WordleFilter {

    private List<String> stringList = List.of("stock", "whole");
    Predicate<String> matchesPredicate;


    public List<String> findMatches(String word) {
        matchesPredicate = c -> c.contains(word);
        return stringList
                .stream()
                .filter(matchesPredicate)
                .collect(Collectors.toList());
    }

}
