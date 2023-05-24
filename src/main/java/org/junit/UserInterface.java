package org.junit;
@FunctionalInterface
public interface UserInterface {
    boolean matchValue (String input) throws UserException;
}
