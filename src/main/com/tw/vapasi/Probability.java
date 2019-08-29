package com.tw.vapasi;

class Probability {

    private int coinEvent;
    private int diceEvent;
    Probability(int coinEvent, int diceEvent) {
        this.coinEvent=coinEvent;
        this.diceEvent=diceEvent;

    }
    boolean compareEvents(Probability probability) {
        if (probability.coinEvent == probability.diceEvent)
            return true ;
        return false;
    }
}
