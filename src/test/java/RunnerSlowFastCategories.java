import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


 @RunWith(Categories.class)
 @Categories.IncludeCategory({RunnerSlowFastCategories.SlowTests.class, RunnerSlowFastCategories.FastTests.class })
 @Categories.ExcludeCategory ( RunnerSlowFastCategories.FastTests.class)
 @Suite.SuiteClasses( { MathTestJUnitHardCode.class,MathTestJUnitNegative.class })


public class RunnerSlowFastCategories {
    public interface FastTests {}
    public interface SlowTests {}

}
