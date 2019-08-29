package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProbabilityTest {

    @Test
    void expectEqualEventForTheOccurrences() {
        Probability probability = new Probability(2, 2);
        assertTrue(probability.compareEvents(probability));
    }
}
