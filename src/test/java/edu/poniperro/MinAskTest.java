package edu.poniperro.sotckX.domain.Criteria;

import edu.poniperro.sotckX.domain.Item.Ask;
import edu.poniperro.sotckX.domain.Item.Sneaker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MinAskTest {
        @Test
        public void minAskTest() {
            List<String> output = new ArrayList<String>();
            output.add("\t\t" + "39" + "\t" + "213" + '\n');
            Sneaker sneaker = new Sneaker("345", "Jordan 1");
            sneaker.add(new Ask("45", 345));
            sneaker.add(new Ask("39", 213));
            sneaker.add(new Ask("43",456));
            MinAsk minAsk = new MinAsk();
            assertEquals(output, minAsk.checkCriteria(sneaker));
        }
    }
