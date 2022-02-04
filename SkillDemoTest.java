import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testReverse() {
        assertEquals("llaf", SkillDemo.reverseString("fall", 0));
    }
}
