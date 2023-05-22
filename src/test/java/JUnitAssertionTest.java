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
    /**
     * This method is for test the one upper case password of 8 character regex pattern
     */
    @Test
    public void whenGiven_Password1Proper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.upperCasePassword("rahulKumar");
        Assert.assertTrue(result);
    }
    /**
     * This method is for test the 1 numeric password of 8 character regex pattern
     */
    @Test
    public void whenGiven_Password2Proper_ShouldReturnTrue(){
        Regex regex = new Regex();
        boolean result = regex.numericPassword("rahul1Kumar");
        Assert.assertTrue(result);
    }
    /**
     * This method is for test the 1 special character password of 8 character regex pattern
     */
    @Test
    public void whenGiven_Password3Proper_ShouldReturnTrue() {
        Regex regex = new Regex();
        boolean result = regex.specialCharacterPassword("rahul@1Kr");
        Assert.assertTrue(result);
    }
    /**
     * This method is for test the valid samples given with regex pattern
     */
    @Test
    public void givenValidEmailSamples_WhenTested_ShouldReturnTrue() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        Regex regex = new Regex();
        for (String validEmail : validEmails) {
            boolean result = regex.emailId(validEmail);
            Assert.assertTrue(result);
        }
    }
    /**
     * This method is for test the invalid samples given with regex pattern
     */
    @Test
    public void givenInvalidEmailSamples_WhenTested_ShouldReturnFalse() {
        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        Regex regex = new Regex();
        for (String inValidEmail : inValidEmails) {
            boolean result = regex.emailId(inValidEmail);
            Assert.assertFalse(result);
        }
    }
    /**
     * This method is for return happy or sad test
     */
    @Test
    public void givenSentence_WhenContainsSad_ShouldPassTest() {
        Regex regex = new Regex();
        String mood = regex.analyseMood("this is a sad message");
        Assert.assertEquals("sad", mood);
    }
}
