package com.tw.vapasi;
import java.util.Objects;

class Probability {
    private final double value;

    Probability(double value) {
        this.value = value;
    }


    Probability and(Probability other) {
        return new Probability(this.value*(other.value));
    }

    Probability or(Probability other) {
        double result = (this.value+other.value-(this.and(other).value));

        return new Probability(result);
    }

    Probability not() {
        return new Probability(1-(this.value));
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }*/

//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }

        @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if ((obj == null) || (obj.getClass() != this.getClass()))
            return false;
        Probability other = (Probability) obj;
        //return other.value.equals(this.value);
        return almostSameValue(other.value, this.value);
    }

    private boolean almostSameValue(double value, double otherValue) {
        return Math.abs(value - otherValue) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "value=" + value +
                '}';
    }
}
