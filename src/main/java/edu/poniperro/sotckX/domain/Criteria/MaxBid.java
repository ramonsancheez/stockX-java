package edu.poniperro.sotckX.domain.Criteria;

import edu.poniperro.sotckX.Behaviour.Criteria;
import edu.poniperro.sotckX.Behaviour.Item;
import edu.poniperro.sotckX.Behaviour.Offer;
import edu.poniperro.sotckX.domain.Item.Bid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxBid implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item item){
        List<Offer> bids = item.offers()
                .stream().filter(x -> x instanceof Bid)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<Offer> maxBid = new ArrayList<>();
        maxBid.add(bids.get(0));
        return maxBid;
    }
}