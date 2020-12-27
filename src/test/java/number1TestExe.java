import org.junit.Before;
import org.junit.Test;

public class number1TestExe {
    private number1 number1;

    @Before
    public void startTest() {
        number1 = new number1();
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        number1.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}
