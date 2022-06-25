import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsTest {

    Items item;

    @Before
    public void setUp(){
        item = new Items("Music Sheets", 2.99, 2.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Music Sheets", item.getName());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(2.99, item.getBoughtPrice(), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(2.99, item.getSellPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkuo() {
        assertEquals(0.00, item.calculateMarkup(item.getSellPrice(), item.getBoughtPrice()), 0.0);
    }
}
