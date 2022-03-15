package lesson17homework;

public class FullNameAbbreviation {
    private static final String firstName = "Robert";
    private static final String middleName = "Brett";
    private static final String surName = "Roser";
    private String fullName;

    static char getFirstCharacterFromFirstName() {
        return firstName.charAt(0);
    }

    static char getFirstCharacterFromMiddleName() {
        return middleName.charAt(0);
    }

    public static void displayFullNameAbbreviation() {
        System.out.println(getFirstCharacterFromFirstName() + "." + getFirstCharacterFromMiddleName() + "." + surName + ".");
    }

}
