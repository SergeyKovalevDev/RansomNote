import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void canConstruct() {
        assertFalse(s.canConstruct("a", "b"));
        assertFalse(s.canConstruct("aa", "ab"));
        assertTrue(s.canConstruct("magazine", "ma4567ht4h4gsdaasadzineasdasdSDAsd"));
        assertTrue(s.canConstruct("aa", "aab"));

    }
}