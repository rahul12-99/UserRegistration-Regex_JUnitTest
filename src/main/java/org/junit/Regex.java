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
        Pattern patternEmail = Pattern.compile("[a-z]+[.]?[a-z]{0,}[@][a-z]+[.][a-z]{2,4}[.]?[a-z]{0,2}");
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
}