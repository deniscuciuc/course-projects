package external.methods.Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");

        System.out.println("ArrayList: " + languages);

        // here we can use index to select wich of position do we need to allocate in array for our new element
        // languages.add(0, "C");

        ArrayList<String> allLanguages = new ArrayList<>();

        allLanguages.addAll(languages);
        System.out.println(allLanguages);

        String second = allLanguages.get(1);
        System.out.println(second);

        allLanguages.set(0,"C++");
        System.out.println(allLanguages);

        allLanguages.remove(2);
        System.out.println(allLanguages);
    }
}
