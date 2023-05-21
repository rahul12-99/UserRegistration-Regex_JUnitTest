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
}