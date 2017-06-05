/**
 * Created by annushka on 03.06.2017.
 */

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

@Category(RunnerSlowFastCategories.FastTests.class)
public class MathTestJUnitNegative {

    private Mathematics mathematics = new Mathematics();
    private int input1, input2, expRes;
    private String nameOfTheTest;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = ArithmeticException.class)
    public void zeroDivide() {
        nameOfTheTest = "Division by Zero";
        input1 = -6;
        input2 = 0;
        mathematics.divide(input1, input2);
    }

    @Test
    public void zeroDivide1() {
        nameOfTheTest = "Division by Zero";
        input1 = -6;
        input2 = 0;
        try {
            mathematics.divide(input1, input2);
            System.out.println("Something went wrong");

        } catch (ArithmeticException myArithmeticException) {
            System.out.println("Test: " + nameOfTheTest + ", Expected: ArithmeticException");
        }

    }
}
