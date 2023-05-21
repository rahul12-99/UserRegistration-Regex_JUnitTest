import org.junit.Assert;
import org.junit.Regex;
import org.junit.Test;

public class JUnitAssertionTest {
    /**
     * This method is for test the regex pattern of first name
     */
    @Test
    public void whenGiven_NameProper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.firstName("Rahul");
        Assert.assertTrue(result);
    }
}
