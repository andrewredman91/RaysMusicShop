import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Saxophone saxophone;


    @Before
    public void setUp() {
        shop = new Shop("Blues");
        saxophone = new Saxophone("Alto Saxophone",
                "Alto Sax", "Lacquered brass",
                319.99, 319.99,
                "Alto", 2750);
    }

    @Test
    public void hasEmptyArray(){
        assertEquals(Arrays.asList(), shop.getStockCount());
    }

    @Test
    public void addToArray(){
        shop.addToStock(saxophone);
        assertEquals(Arrays.asList(saxophone), shop.getStockCount());
    }

    @Test
    public void canRemoveFromArray(){
        shop.addToStock(saxophone);
        shop.removeStock(saxophone);
        assertEquals(Arrays.asList(), shop.getStockCount());
    }
}
