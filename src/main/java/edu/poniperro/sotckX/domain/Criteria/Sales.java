package edu.poniperro.sotckX.domain.Criteria;

import edu.poniperro.sotckX.Behaviour.Criteria;
import edu.poniperro.sotckX.Behaviour.Item;
import edu.poniperro.sotckX.Behaviour.Offer;
import edu.poniperro.sotckX.domain.Item.Bid;
import edu.poniperro.sotckX.domain.Item.Sale;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria {
    public List<Offer> checkCriteria(Item item){
        return item
                .offers()
                .stream()
                .filter(x -> x instanceof Sale)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}

