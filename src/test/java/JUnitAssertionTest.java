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
    /**
     * This method is for test the last name regex pattern
     */
    @Test
    public void whenGiven_LastNameProper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.lastName("Kumar");
        Assert.assertTrue(result);
    }
    /**
     * This method is for test the email I'd regex pattern
     */
    @Test
    public void whenGiven_EmailIdProper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.emailId("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    /**
     * This method is for test the mobile number regex pattern
     */
    @Test
    public void whenGiven_MobileNumberProper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.mobileNumber("91 9934691893");
        Assert.assertTrue(result);
    }
    /**
     * This method is for test the password of 8 character regex pattern
     */
    @Test
    public void whenGiven_PasswordProper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.password("rahulkumar");
        Assert.assertTrue(result);
    }
    @Test
    public void whenGiven_Password1Proper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.upperCasePassword("rahulKumar");
        Assert.assertTrue(result);
    }
    @Test
    public void whenGiven_Password2Proper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.numericPassword("rahul1Kumar");
        Assert.assertTrue(result);
    }
}
