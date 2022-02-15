package edu.poniperro.sotckX.domain.Item;

import edu.poniperro.sotckX.Behaviour.Item;
import edu.poniperro.sotckX.Behaviour.Offer;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    private String style = "";
    private String name = "";
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }
    public String getStyle() {
        return style;
    }
    public String getName() {
        return name;
    }
    @Override
    public int getSale() {
        return sale;
    }
    @Override
    public int getAsk() {
        return ask;
    }
    @Override
    public int getBid() {
        return bid;
    }
    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
    @Override
    public void add(Offer offer) {
        this.offers.add(offer);
    }
    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return this.name + "\n \t \t" + this.style;
    }
}
