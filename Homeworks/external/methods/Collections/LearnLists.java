package external.methods.Collections;
import java.util.ArrayList;
import java.util.List;

public class LearnLists {


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Dennis");
        list1.add("Misha");
        list1.add("Vanya");
        System.out.println("List: " + list1);
        String firstName = list1.get(0);
        System.out.println("Accessed Element: " + firstName);

    }
}
