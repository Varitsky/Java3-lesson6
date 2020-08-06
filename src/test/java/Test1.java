import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 6, 5, 4, 2, 3, 3}, new int[]{2, 3, 3}},
                {new int[]{4, 3, 7, 5, 4, 4, 3, 2}, new int[]{3, 2}},
                {new int[]{4, 3, 7, 5, 4, 2, 2, 2}, new int[]{2, 2, 2}},
                {new int[]{4, 3, 7, 5, 4, 4, 4, 2}, new int[]{2}},
                {new int[]{4, 3, 7, 5, 4, 4, 3, 2}, new int[]{3, 2}},
                {new int[]{3, 3, 7, 5, 3, 3, 3, 2}, new int[]{3, 2}},
        });
    }

    private int[] in;
    private int[] out;

    public Test1(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    Task1 task1;

    @Before
    public void startTest() {
        task1 = new Task1();
    }

    @Test
    public void testAfterLast4() {
        Assert.assertArrayEquals(out, Task1.returnNewArrayAfterLastFour(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Task1.returnNewArrayAfterLastFour(in);
    }
}