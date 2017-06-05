import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * Created by annushka on 03.06.2017.
 */

@RunWith(Parameterized.class)
public class MathTestJUnitDDT {

    private Mathematics mathematics = new Mathematics();
    private int input1;
    private int input2;
    private int expResAdd;
    private int expResDeduct;
    private int expResDivision;
    private int expResMultiply;
    private int expRes;
    private String operationName;

    @Parameterized.Parameters(name = "{index}: X={0} Y={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1, 1, -1, 0, 0},
                {0, -1, -1, 1, 0, 0},
                {17, 3, 20, 14, 5, 51},
                {-3, 11, 8, -14, 0, -33},
                {7, -2, 5, 9, -3, -14},
                {-5, -6, -11, 1, 0, 30},
                {-32767, 1, -32766, -32768, -32767, -32767},
                {32766, 1, 32767, 32765, 32766, 32766}
        });
    }


    public MathTestJUnitDDT(int input1, int input2, int expResAdd, int expResDeduct, int expResDivision, int expResMultiply) {
        this.input1 = input1;
        this.input2 = input2;
        this.expResAdd = expResAdd;
        this.expResDeduct = expResDeduct;
        this.expResDivision = expResDivision;
        this.expResMultiply = expResMultiply;
    }

    @Before
    public void setZeroResultJ() throws Exception {
        mathematics.setResult(0);
    }

    @After
    public void resultAssertJ() throws Exception {
        System.out.println("Test: " + operationName + ", Expected: " + expRes + ", Actual: " + mathematics.getResult());
    }

    @Test
    public void testDeduct() throws Exception {
        operationName = "Deduction";
        mathematics.deduct(input1, input2);
        expRes = expResDeduct;
        assertEquals(expRes, mathematics.getResult());
    }

    @Test
    public void testAdd() throws Exception {
        operationName = "Addition";
        expRes = expResAdd;
        mathematics.add(input1, input2);
        assertEquals(expRes, mathematics.getResult());
    }

    @Test
    public void testMultiply() throws Exception {
        operationName = "Multiplication";
        expRes = expResMultiply;
        mathematics.multiply(input1, input2);
        assertEquals(expRes, mathematics.getResult());
    }

    @Test
    public void testDivide() throws Exception {
        operationName = "Division";
        expRes = expResDivision;
        mathematics.divide(input1, input2);
        assertEquals(expRes, mathematics.getResult());
    }
}
