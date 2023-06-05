package com.fnac.kata;

import java.util.Map;

public class YamCombination {
    private int pairs;
    private int brelans;
    private int max;
    private int min;
    private int score;

    public YamCombination() {
        this.pairs = 0;
        this.brelans = 0;
        this.max = 0;
        this.min = Integer.MAX_VALUE;
    }

    public int score(Map<ThimbleValue, SameThimblesCount> yamCounts) {
        this.score = 0;
        for (var entry : yamCounts.entrySet()) {
            initCombinationsByThimbleValueCount(entry);
        }
        incrementScoreForPairs();
        incrementScoreForBrelan();

        if (isASuite(yamCounts)) {
            return 7;
        }
        if (hasNoCombination()) {
            return 1;
        }
        return score;
    }

    private void initCombinationsByThimbleValueCount(Map.Entry<ThimbleValue, SameThimblesCount> entry) {
        switch ((int) entry.getValue().count()) {
            case 2 -> pairs++;
            case 3 -> brelans++;
            case 4 -> score += 10;
            case 5 -> score += 20;
            default -> {
                max = Math.max(max, entry.getKey().yamValue());
                min = Math.min(min, entry.getKey().yamValue());
            }
        }
    }

    private boolean hasNoCombination() {
        return pairs == 0 && brelans == 0 && score == 0;
    }

    private boolean isASuite(Map<ThimbleValue, SameThimblesCount> yamCounts) {
        return yamCounts.size() == 5 && max - min == 4;
    }

    private void incrementScoreForBrelan() {
        if (brelans == 1) {
            score += 5;
        }
    }

    private void incrementScoreForPairs() {
        if (pairs == 2) {
            score += 4;
        } else if (pairs == 1) {
            score += 3;
        }
    }

}
