package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class ProbabilityTest {

    @Test
    void expectTrueEventForTheOccurrences() {
        Probability probability1 = new Probability(0.5);
        assertTrue(probability1.equals(probability1));
    }

    @Test
    void expectFalseForObjectIsNull() {
        Probability probability1 = new Probability(0.5);
        assertFalse(probability1.equals(null));
    }

    @Test
    void expectTrueForObjectsVariablesAreEqual() {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);
        assertEquals(true, probability1.equals(probability2));
    }

    @Test
    void expectTrueForCoinEventHeadAndDiceEventSix() {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.16);
        assertEquals(new Probability(0.08), probability1.and(probability2));
    }

    @Test
    void expectTrueForCoinEventHeadOrDiceEventSix() {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.16);
        assertEquals(new Probability(0.580), probability1.or(probability2));
    }

    @Test
    void expectTrueForCoinEventHeadNotDiceEventSix() {
        Probability probability1 = new Probability(0.5);
        assertEquals(new Probability(0.5), probability1.not());
    }


}
