
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
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
    @Parameters({
            "1, 1",
            "2, 1",
            "3, 2",
            "11,89"})
    public void CollectionFibo(int numb, int result) throws Exception
    {
        int actual = fibo.Fib(numb);

        assertEquals(actual, result);
    }

}
