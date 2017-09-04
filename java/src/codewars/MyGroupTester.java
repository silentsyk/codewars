import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyGroupTester {

    @Test
    public void myTests() {
        assertEquals(Groups.groupCheck("()"), true);
        assertEquals(Groups.groupCheck("({"), false);
    }
}

