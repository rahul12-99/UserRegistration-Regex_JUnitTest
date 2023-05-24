package org.junit;

import java.util.regex.Pattern;

public class Regex {
    /**
     * This method is for compiling the input pattern and match with pattern and return true;
     */
    public UserInterface forFirstName = input -> {
        boolean patternOne;
        try {
            patternOne = Pattern.compile("[A-Z][a-z]{2,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter correct name");
        }

        return patternOne;
    };
    /**
     * This method is for compiling the input pattern for last name
     * and match with pattern and return true;
     */
    public UserInterface forLastName = input -> {
        boolean patternOne;
        try {
            patternOne = Pattern.compile("[A-Z][a-z]{2,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter correct last name");
        }

        return patternOne;
    };
    /**
     * This method is for compiling the input pattern for emailId
     * and match with pattern and return true;
     */
    public UserInterface forEmailId = input -> {
        boolean patternEmail;
        try {
            patternEmail = Pattern.compile("[a-z-+0-9]+[.]?[a-z0-9]+" +
                    "[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter proper email id");
        }

        return patternEmail;
    };
    /**
     * This method is for compiling the input pattern for mobileNumber
     * and match with pattern and return true;
     */
    public UserInterface forMobileNumber = input -> {
        boolean patternMobile;
        try {
            patternMobile = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter proper mobile number");
        }

        return patternMobile;
    };
    /**
     * This method is for compiling the input pattern for password
     * 8 character and match with pattern and return true;
     */
    public UserInterface forPassword = input -> {
        boolean patternPass;
        try {
            patternPass = Pattern.compile("[A-Za-z]{8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter minimum 8 character");
        }
        return patternPass;
    };

    /**
     * This method is for compiling the input pattern for password
     * 8 character and one upper case char match with pattern and return true;
     */
    public UserInterface forUpperCasePassword = input -> {
        boolean patternPass1;
        try {
            patternPass1 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter minimum one upper case character");
        }
        return patternPass1;
    };

    /**
     * This method is for compiling the input pattern for password min 8 character,
     * one upper case char, one numeric match with pattern and return true;
     */
    public UserInterface forNumericPassword = input -> {
        boolean patternPass2;
        try {
            patternPass2 = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9]).+${8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter 1 upper case character and one numeric value");
        }
        return patternPass2;
    };

    /**
     * This method is for compiling the input pattern for password min 8 character,
     * one upper case char, one numeric and one special char match with pattern and return true;
     */
    public UserInterface forSpecialCharacterPassword = input -> {
        boolean patternPass3;
        try {
            patternPass3 = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+" +
                    "[0-9])(?=.+[-+_!@#$%^&*.,?]).+${8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserException("Enter exactly one special character");
        }
        return patternPass3;
    };

    /**
     * This method for analyse the mood if the test sentences contain sad should return sad
     */
    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        return "happy";
    }
}