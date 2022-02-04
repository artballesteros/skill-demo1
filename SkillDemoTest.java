import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testReverse() {
        assertEquals("fall", SkillDemo.reverseString("fall", 0));
    }
}
