package com.tw.vapasi;

class Probability {
    private int maxChances;
    private int occurences;

    Probability(int maxChances, int occurrences) {
        this.maxChances = maxChances;
        this.occurences = occurrences;

    }

    boolean compareEvents(Probability probability1, Probability probability2) {
        if (getProbability(probability1) == getProbability(probability2))
            return true;
        return false;
    }

    double getProbability(Probability probability) {
        return probability.occurences / probability.maxChances;
    }
    double getProbability1(Probability probability) {
        return 0.25;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if ((obj == null) || (obj.getClass() != this.getClass()))
            return false;
        if (getProbability(this) == getProbability((Probability)obj))
            return true;
        else
            return false;
    }
}
