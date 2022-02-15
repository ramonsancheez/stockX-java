package edu.poniperro.sotckX.domain.Criteria;

import edu.poniperro.sotckX.Behaviour.Criteria;
import edu.poniperro.sotckX.Behaviour.Item;
import edu.poniperro.sotckX.Behaviour.Offer;
import edu.poniperro.sotckX.domain.Item.Bid;
import edu.poniperro.sotckX.domain.Item.Sale;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LastSale implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> sale = item.offers();
         item.offers()
                .stream()
                .filter(x -> x instanceof Sale)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<Offer> lastSale = new ArrayList<>();
        lastSale.add(sale.get(0));
        return lastSale;
    }
}
