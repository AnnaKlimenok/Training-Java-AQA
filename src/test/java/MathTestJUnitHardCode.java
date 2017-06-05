import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.FixMethodOrder;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;


/**
 * Created by annushka on 03.06.2017.
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category(RunnerSlowFastCategories.SlowTests.class)
public class MathTestJUnitHardCode {

    private Mathematics mathematics=new Mathematics();
    private int input1, input2, expRes;
    private String nameOfTheTest;



    @Before
    public void setZeroRezultJ() throws Exception{
       mathematics.setResult(0);
    }

    @After
    public void resultAssertJ()throws Exception{
       System.out.println ("Test: "+nameOfTheTest+ ", Expected: "+expRes+ ", Actual: "+mathematics.getResult());
    }

    @Test
    public void testDeductJ() throws Exception {
        nameOfTheTest="Deduction";
        input1=-2;
        input2 =3;
        expRes =-5;
        mathematics.deduct(input1,input2);
        assertEquals(expRes,mathematics.getResult());
    }


    @Test(timeout=100)
    public void testAddJ() throws Exception{
        Thread.sleep(200);
        nameOfTheTest="Addition";
        input1=-2;
        input2 =3;
        expRes =1;
        mathematics.add(input1,input2);
        assertEquals(expRes,mathematics.getResult());
    }


    @Test
    public void testMultiplyJ() throws Exception {
        nameOfTheTest="Multiplication";
        input1=-2;
        input2 =3;
        expRes =-6;
        mathematics.multiply(input1,input2);
        assertEquals(expRes,mathematics.getResult());
    }

    @Test
    public void testDivideJ() throws Exception{
        nameOfTheTest="Division";
        input1=-6;
        input2 =3;
        expRes =-2;
        mathematics.divide(input1,input2);
        assertEquals(expRes,mathematics.getResult());
    }


}
