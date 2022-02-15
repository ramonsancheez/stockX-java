package edu.poniperro.sotckX.domain.Item;

import edu.poniperro.sotckX.Behaviour.Offer;

public class Ask  implements Offer{
    private String size = "";
    private Integer ask = 0;
    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value() {
        return this.ask;
    }
    @Override
    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }
    @Override
    public String toString() {
        return "\t\t" + this.size + "\t" + this.value() + '\n';
    }
}
