package com.fnac.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class YamGameTest {

    private YamGame yamGame;

    @BeforeEach
    void setUp() {
        yamGame = new YamGame();
    }

    @Test
    void should_have_1_point() {
        int points = yamGame.rolls(4, 2, 1, 3, 6);
        assertThat(points).isEqualTo(1);
    }


    @Test
    void should_have_3_points_paire() {
        int points = yamGame.rolls(2, 2, 1, 3, 5);
        assertThat(points).isEqualTo(3);
    }

    @Test
    void should_have_5_points_brelan() {
        int points = yamGame.rolls(2, 2, 2, 3, 5);
        assertThat(points).isEqualTo(5);
    }

    @Test
    void should_have_10_points_carre() {
        int points = yamGame.rolls(2, 2, 2, 2, 5);
        assertThat(points).isEqualTo(10);
    }

    @Test
    void should_have_20_points_yam() {
        int points = yamGame.rolls(2, 2, 2, 2, 2);
        assertThat(points).isEqualTo(20);
    }

    @Test
    void should_have_4_points_double_paire() {
        int points = yamGame.rolls(5, 5, 2, 2, 3);
        assertThat(points).isEqualTo(4);
    }

    @Test
    void should_have_8_points_full() {
        int points = yamGame.rolls(5, 5, 5, 6, 6);
        assertThat(points).isEqualTo(8);
    }

    @Test
    void should_have_7_points_suite_1() {
        int points = yamGame.rolls(4, 5, 3, 2, 1);
        assertThat(points).isEqualTo(7);
    }

    @Test
    void should_have_7_points_suite_2() {
        int points = yamGame.rolls(2,3,4,5,6);
        assertThat(points).isEqualTo(7);
    }
}
