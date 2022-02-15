package edu.poniperro.sotckX.domain.Item;

import edu.poniperro.sotckX.Behaviour.Offer;

public class Sale  implements Offer{
    private String size = "";
    private Integer price = 0;
    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }
    public String size() {
        return this.size;
    }
    public int value() {
        return this.price;
    }
    public int compareTo(Offer price) {
        return this.price.compareTo(price.value());
    }
    @Override
    public String toString() {
        return "\t\t" + this.size + "\t" + this.value() + "\n";
    }
}
