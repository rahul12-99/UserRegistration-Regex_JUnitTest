package org.junit;

import java.util.regex.Pattern;

public class Regex {
    /**
     * This method is for compiling the input pattern and match with pattern and return true;
     */
    public boolean firstName(String firstName) throws UserException{
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        try {
            return patternOne.matcher(firstName).matches();
        }catch (Exception e){
            throw new UserException("Enter correct name");
        }

    }
    /**
     * This method is for compiling the input pattern for last name
     * and match with pattern and return true;
     */
    public boolean lastName(String lastName)throws UserException{
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        try {
            return patternOne.matcher(lastName).matches();
        }catch (Exception e){
            throw new UserException("Enter correct last name");
        }

    }
    /**
     * This method is for compiling the input pattern for emailId
     * and match with pattern and return true;
     */
    public boolean emailId(String emailId)throws UserException {
        Pattern patternEmail = Pattern.compile("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}");
        try {
            return patternEmail.matcher(emailId).matches();
        }catch (Exception e){
            throw new UserException("Enter proper email id");
        }

    }
    /**
     * This method is for compiling the input pattern for mobileNumber
     * and match with pattern and return true;
     */
    public boolean mobileNumber(String mobNumber)throws UserException {
        Pattern patternMobile = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$");
        try {
            return patternMobile.matcher(mobNumber).matches();
        } catch (Exception e){
            throw new UserException("Enter proper mobile number");
        }
    }
    /**
     * This method is for compiling the input pattern for password
     * 8 character and match with pattern and return true;
     */
    public boolean password(String password)throws UserException {
        Pattern patternPass = Pattern.compile("[A-Za-z]{8,}");
        try {
            return patternPass.matcher(password).matches();
        }catch (Exception e){
            throw new UserException("Enter minimum 8 character");
        }

    }
    /**
     * This method is for compiling the input pattern for password
     * 8 character and one upper case char match with pattern and return true;
     */
    public boolean upperCasePassword(String upperCase)throws UserException {
        Pattern patternPass1 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");
        try {
            return patternPass1.matcher(upperCase).matches();
        }catch (Exception e){
            throw new UserException("Enter minimum one upper case character");
        }

    }
    /**
     * This method is for compiling the input pattern for password min 8 character,
     *  one upper case char, one numeric match with pattern and return true;
     */
    public boolean numericPassword(String numeric)throws UserException {
        Pattern patternPass2 = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9]).+${8,}");
        try {
            return patternPass2.matcher(numeric).matches();
        }catch (Exception e){
            throw new UserException("Enter 1 upper case character and one numeric value");
        }

    }
    /**
     * This method is for compiling the input pattern for password min 8 character,
     * one upper case char, one numeric and one special char match with pattern and return true;
     */
    public boolean specialCharacterPassword(String character)throws UserException {
        Pattern patternPass3 = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*.,?]).+${8,}");
        try {
            return patternPass3.matcher(character).matches();
        }catch (Exception e){
            throw new UserException("Enter exactly one special character");
        }
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