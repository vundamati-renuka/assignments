package SecondWeekAssignments;

import java.util.Map;
import java.util.TreeMap;

public class CountryPopulation {
    public static void main(String[] args) {
        TreeMap<String, Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("India", 1400000000);
        countryPopulations.put("Ireland", 5000000);
        countryPopulations.put("Indonesia", 273000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("France", 67000000);
        countryPopulations.put("Italy", 60000000);
        countryPopulations.put("Iceland", 370000);

        System.out.println("Countries starting with 'I':");
        for (Map.Entry<String, Integer> entry : countryPopulations.entrySet()) {
            if (entry.getKey().startsWith("I")) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

