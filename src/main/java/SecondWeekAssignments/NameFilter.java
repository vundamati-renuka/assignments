package SecondWeekAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameFilter {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Anand");
        names.add("Bob");
        names.add("Annie");
        names.add("Charlie");
        names.add("Amos");


        Collections.sort(names);

        System.out.println("Names starting with 'A':");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}
