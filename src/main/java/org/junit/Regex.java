package org.junit;

import java.util.regex.Pattern;

public class Regex {
    /**
     * This method is for compiling the input pattern and match with pattern and return true;
     */
    public boolean firstName(String firstName) {
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        return patternOne.matcher(firstName).matches();
    }
    /**
     * This method is for compiling the input pattern for last name
     * and match with pattern and return true;
     */
    public boolean lastName(String lastName){
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        return patternOne.matcher(lastName).matches();
    }
    /**
     * This method is for compiling the input pattern for emailId
     * and match with pattern and return true;
     */
    public boolean emailId(String emailId) {
        Pattern patternEmail = Pattern.compile("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}");
        return patternEmail.matcher(emailId).matches();
    }
    /**
     * This method is for compiling the input pattern for mobileNumber
     * and match with pattern and return true;
     */
    public boolean mobileNumber(String mobNumber) {
        Pattern patternMobile = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$");
        return patternMobile.matcher(mobNumber).matches();
    }
    /**
     * This method is for compiling the input pattern for password
     * 8 character and match with pattern and return true;
     */
    public boolean password(String password) {
        Pattern patternPass = Pattern.compile("[A-Za-z]{8,}");
        return patternPass.matcher(password).matches();
    }
    /**
     * This method is for compiling the input pattern for password
     * 8 character and one upper case char match with pattern and return true;
     */
    public boolean upperCasePassword(String upperCase) {
        Pattern patternPass1 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");
        return patternPass1.matcher(upperCase).matches();
    }
    /**
     * This method is for compiling the input pattern for password min 8 character,
     *  one upper case char, one numeric match with pattern and return true;
     */
    public boolean numericPassword(String numeric) {
        Pattern patternPass2 = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9]).+${8,}");
        return patternPass2.matcher(numeric).matches();
    }
    /**
     * This method is for compiling the input pattern for password min 8 character,
     * one upper case char, one numeric and one special char match with pattern and return true;
     */
    public boolean specialCharacterPassword(String character) {
        Pattern patternPass3 = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*.,?]).+${8,}");
        return patternPass3.matcher(character).matches();
    }

    /**
     * This method for analyse the mood if the test sentences contain sad should return sad
     */
    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        return "happy";
    }
}