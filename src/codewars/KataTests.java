import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(12, Kata.nextSmaller(21));
        assertEquals(790, Kata.nextSmaller(907));
        assertEquals(513, Kata.nextSmaller(531));
        assertEquals(-1, Kata.nextSmaller(1027));
        assertEquals(1072, Kata.nextSmaller(1207));
        assertEquals(414, Kata.nextSmaller(441));
        assertEquals(12111111111111111L, Kata.nextSmaller(21111111111111111L));


    }
}