package lesson10homework;

public class StringConverter {

    public static void stringConverter() {
        Boolean booleanWrapperFromString = new Boolean("tRue");
        Byte byteWrapperFromString = new Byte("120");
        Short shortWrapperFromString = new Short("32000");
        Integer intWrapperFromString = new Integer("147895632");
        Long longWrapperFromString = new Long("987654321987654321");
        Double doubleWrapperFromString = new Double("4444.5d");
        Float floatWrapperFromString = new Float("2354.56f");

        System.out.println(booleanWrapperFromString);
        System.out.println(byteWrapperFromString);
        System.out.println(shortWrapperFromString);
        System.out.println(intWrapperFromString);
        System.out.println(longWrapperFromString);
        System.out.println(doubleWrapperFromString);
        System.out.println(floatWrapperFromString);
    }
}
