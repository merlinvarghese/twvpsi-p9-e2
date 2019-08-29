package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ProbabilityTest {

    @Test
    void expectTrueEventForTheOccurrences() {
        Probability probability1 = new Probability(2,2);
        assertTrue(probability1.equals(probability1));
       // assertTrue(true, probability1.compareEvents(probability2));
    }

    @Test
    void expectFalseForObjectIsNull() {
        Probability probability1 = new Probability(1, 2);
        assertFalse(probability1.equals(null));
    }

    @Test
    void expectTrueForObjectsVariablesAreEqual() {
        Probability probability1 = new Probability(2,2);
        Probability probability2 = new Probability(2, 2);
        assertEquals(true,probability1.equals(probability2));
    }

    @Test
    void expectTrueForCoinEventHeadAndDiceEventSix(){
        Probability probability1 = new Probability(6,1);
        Probability probability2 = new Probability(2, 1);
        assertEquals(0.25,probability1.getProbability1(probability2));

    }

}
