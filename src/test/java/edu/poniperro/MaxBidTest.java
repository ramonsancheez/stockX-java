package edu.poniperro.sotckX.domain.Criteria;

import edu.poniperro.sotckX.domain.Item.Bid;
import edu.poniperro.sotckX.domain.Item.Sneaker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxBidTest {
  
        @Test
        public void maxBidTest() {
            List<String> output = new ArrayList<String>();
            output.add("\t\t" + "43" + "\t" + "456" + '\n');
            Sneaker sneaker = new Sneaker("345", "Jordan 1");
            sneaker.add(new Bid("45", 345));
            sneaker.add(new Bid("39", 213));
            sneaker.add(new Bid("43",456));
            MaxBid maxBid = new MaxBid();
            assertEquals(output, maxBid.checkCriteria(sneaker));
        }
    }
