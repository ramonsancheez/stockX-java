package edu.poniperro.sotckX.Behaviour;

public interface Offer extends Comparable<Offer>{
    String size();
    int value();
    int compareTo(Offer offer);
}
