import Instruments.Saxophone;
import Instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void setUp() {
        tuba = new Tuba("Marching Bb Tuba",
                "Marching BB", "Yellow Brass",
                799.99, 799.99, 8300);
    }

    @Test
    public void canGetTubaName(){
        assertEquals("Marching Bb Tuba", tuba.getName());
    }

    @Test
    public void canGetTubaWeight(){
        assertEquals(8300, tuba.getSaxWeight());
    }

    @Test
    public void canPlay() {
        assertEquals("Tuba sounds", tuba.play());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(799.99, tuba.getBoughtPrice(), 0.0);
    }

    @Test public void getSellPrice(){
        assertEquals(799.99, tuba.getSellPrice(), 0.0);
    }

    @Test public void calculateMarkup(){
        assertEquals(0.0, tuba.calculateMarkup(tuba.getSellPrice(), tuba.getBoughtPrice()), 0.0);
    }
}
