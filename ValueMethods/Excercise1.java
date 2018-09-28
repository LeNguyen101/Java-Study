import junit.framework.TestCase;
public class Excercise1 extends TestCase {
    public void testFibonacci () {
        assertEquals(1, Series.fibonacci(1));
        assertEquals(1, Series.fibonacci(2));
        assertEquals(2, Series.fibonacci(3));
    }
} 