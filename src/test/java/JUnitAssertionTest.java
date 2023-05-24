import org.junit.Assert;
import org.junit.Regex;
import org.junit.Test;
import org.junit.UserException;

public class JUnitAssertionTest {
    /**
     * This method is for test the regex pattern of first name
     */
    @Test
    public void whenGiven_NameProper_ShouldReturnTrue() {
        Regex regex = new Regex();
        try {
            regex.forFirstName.matchValue("Rahul");
        } catch (UserException e) {
            Assert.assertEquals("Enter correct name", e.getMessage());
        }
    }

    /**
     * This method is for test the last name regex pattern
     */
    @Test
    public void whenGiven_LastNameProper_ShouldReturnTrue() {
        Regex regex = new Regex();
        try {
            regex.forLastName.matchValue("Kumar");
        } catch (UserException e) {
            Assert.assertEquals("Enter correct last name", e.getMessage());
        }
    }

    /**
     * This method is for test the email I'd regex pattern
     */
    @Test
    public void whenGiven_EmailIdProper_ShouldReturnTrue() {
        Regex regex = new Regex();
        try {
            regex.forEmailId.matchValue("abc.xyz@bl.co.in");

        } catch (UserException e) {
            Assert.assertEquals("Enter proper email id", e.getMessage());
        }
    }

    /**
     * This method is for test the mobile number regex pattern
     */
    @Test
    public void whenGiven_MobileNumberProper_ShouldReturnTrue() {
        Regex regex = new Regex();
        try {
            regex.forMobileNumber.matchValue("91 9934691893");
        } catch (UserException e) {
            Assert.assertEquals("Enter proper mobile number", e.getMessage());
        }

    }

    /**
     * This method is for test the password of 8 character regex pattern
     */
    @Test
    public void whenGiven_PasswordProper_ShouldReturnTrue() throws UserException {
        Regex regex = new Regex();
        try {
            regex.forPassword.matchValue("rahulkumar");
        } catch (UserException e) {
            Assert.assertEquals("Enter minimum 8 character", e.getMessage());
        }

    }

    /**
     * This method is for test the one upper case password of 8 character regex pattern
     */
    @Test
    public void whenGiven_Password1Proper_ShouldReturnTrue() throws UserException {
        Regex regex = new Regex();
        try {
            regex.forUpperCasePassword.matchValue("rahulKumar");
        } catch (UserException e) {
            Assert.assertEquals("Enter minimum one upper case character", e.getMessage());
        }

    }

    /**
     * This method is for test the 1 numeric password of 8 character regex pattern
     */
    @Test
    public void whenGiven_Password2Proper_ShouldReturnTrue() throws UserException {
        Regex regex = new Regex();
        try {
            regex.forNumericPassword.matchValue("rahul1Kumar");
        } catch (UserException e) {
            Assert.assertEquals("Enter 1 upper case character and one numeric value", e.getMessage());
        }

    }

    /**
     * This method is for test the 1 special character password of 8 character regex pattern
     */
    @Test
    public void whenGiven_Password3Proper_ShouldReturnTrue() throws UserException {
        Regex regex = new Regex();
        try {
            regex.forSpecialCharacterPassword.matchValue("rahul@1Kr");
        } catch (UserException e) {
            Assert.assertEquals("Enter exactly one special character", e.getMessage());
        }
    }

    /**
     * This method is for test the valid samples given with regex pattern
     */
    @Test
    public void givenValidEmailSamples_WhenTested_ShouldReturnTrue() throws UserException {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        Regex regex = new Regex();
        for (String validEmail : validEmails) {
            boolean result = regex.forEmailId.matchValue(validEmail);
            Assert.assertTrue(result);
        }
    }

    /**
     * This method is for test the invalid samples given with regex pattern
     */
    @Test
    public void givenInvalidEmailSamples_WhenTested_ShouldReturnFalse() throws UserException {
        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        Regex regex = new Regex();
        for (String inValidEmail : inValidEmails) {
            boolean result = regex.forEmailId.matchValue(inValidEmail);
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
