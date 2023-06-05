package com.fnac.kata;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class YamGame {

    public int rolls(int thimble1, int thimble2, int thimble3, int thimble4, int thimble5) {
        Map<ThimbleValue, SameThimblesCount> thimblesCounts = Stream.of(thimble1, thimble2, thimble3, thimble4, thimble5)
                .collect(groupingBy(
                        ThimbleValue::new,
                        Collectors.collectingAndThen(counting(), SameThimblesCount::new))
                );
        var combination = new YamCombination();
        return combination.score(thimblesCounts);
    }
}
