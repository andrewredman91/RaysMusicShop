import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
    saxophone = new Saxophone("Alto Saxophone",
            "Alto Sax", "Lacquered brass",
            319.99, 319.99,"Alto", 2750);
    }

    @Test
    public void canGetSaxName(){
        assertEquals("Alto Saxophone", saxophone.getName());
    }

    @Test
    public void canGetSaxSize(){
        assertEquals("Alto", saxophone.getSaxSize());
    }

    @Test
    public void canGetSaxWeight(){
        assertEquals(2750, saxophone.getSaxWeight());
    }

    @Test
    public void canPlay() {
        assertEquals("Sax sounds", saxophone.play());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(319.99, saxophone.getBoughtPrice(), 0.0);
    }

    @Test public void getSellPrice(){
        assertEquals(319.99, saxophone.getSellPrice(), 0.0);
    }

    @Test public void calculateMarkup(){
        assertEquals(0.0, saxophone.calculateMarkup(saxophone.getSellPrice(), saxophone.getBoughtPrice()), 0.0);
    }
}
