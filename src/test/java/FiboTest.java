
import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class FiboTest {

    private Fibo fibo;


    @Before
    public void Setup() {
        fibo = new Fibo();
    }

    @Test
    public void Given1_Return1()
    {
        int expected = 1, value = 1;

        int result = fibo.Fib(value);

        assertEquals(expected, result);
    }

}
