import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 1, 4, 4, 1 ,4, 4}, true},
                {new int[]{8, 8, 7, 7, 7, 3, 5, 1}, false},
                {new int[]{1, 1, 1, 1, 1, 1}, false},
                {new int[]{4, 4, 4, 4}, false},
                {new int[]{1, 4, 4, 1, 1, 4, 3}, true},  //NEPRAVDA
                {new int[]{1, 4, 4, 1, 1, 4, 4}, true},

        });
    }
    private int[] numbersArray;
    private boolean testBoolean;

    public Test2(int[] in, boolean out) {
        this.numbersArray = in;
        this.testBoolean = out;
    }

    Task2 task2;

    @Before
    public void init() {
        task2 = new Task2();
    }

    @Test
    public void test2() {
        Assert.assertEquals(testBoolean, Task2.arrayOfOneAndFour(numbersArray));
    }
}
