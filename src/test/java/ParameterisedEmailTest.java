import org.junit.Assert;
import org.junit.Regex;
import org.junit.Test;
import org.junit.UserException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedEmailTest {
    /**
     * Declared instance variable
     */
    private final String emailToTest;
    private final boolean expectedResult;

    /**
     * Parameterised constructor of this class
     */
    public ParameterisedEmailTest(String emailToTest, boolean expectedResult) {
        this.emailToTest = emailToTest;
        this.expectedResult = expectedResult;
    }

    /**
     * This method is for input the email as email to test with expected result and
     * return it to in array as list and verify with constructor
     */
    @Parameterized.Parameters
    public static Collection Data() {
        return Arrays.asList(new Object[][] {{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}, {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}, {"abc", false}, {"abc@.com.my", false},
                {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false},
                {"abc..2002@gmail.com", false}, {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}} );
    }

    /**
     * This is tested for all given email as expected
     */
    @Test
    public void givenEmail_WhenTested_ShouldPassAsExpected() throws UserException {
        Regex regex = new Regex();
        boolean result = regex.forEmailId.matchValue(this.emailToTest);
        Assert.assertEquals(this.expectedResult, result);
    }
}
