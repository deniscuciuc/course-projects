package Lesson8Homework;

public class SpecificValue {
    public static void main (String[] args) {
        int[] array = {5, 6, 7, 9, 33};
        checkIfExistsOneDimensionalIntArray(array, 5);

    }

    static boolean checkIfExistsOneDimensionalIntArray (int[] array, int elementToCheck) {
        boolean exists = false;

        for (int i : array) {
            if (i == elementToCheck) {
                exists = true;
                break;
            }
        }
        if (exists == true) {
            System.out.println("In array exist: " + elementToCheck);
        } else {
            System.out.println("In array not exist " + elementToCheck);
        }
        return exists;
    }
}
