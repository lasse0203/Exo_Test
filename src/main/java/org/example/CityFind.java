package org.example;

import java.util.ArrayList;
import java.util.List;

public class CityFind {

    private List<String> cities = new ArrayList<>();

    public CityFind() {

        cities.add("Paris");
        cities.add("Budapest");
        cities.add("Skopje");
        cities.add("Rotterdam");
        cities.add("Valence");
        cities.add("Vancouver");
        cities.add("Amsterdam");
        cities.add("Vienne");
        cities.add("Sydney");
        cities.add("NewYork");
        cities.add("Londres");
        cities.add("Bangkok");
        cities.add("Hong Kong");
        cities.add("Dubaï");
        cities.add("Rome");
        cities.add("Istanbul");
    }
    public List<String> findCities(String searchText) {
        if (searchText.length() < 2 && !"*".equals(searchText)) {
            throw new NotFoundException("Search text should be at least 2 characters long.");
        }

        List<String> results = new ArrayList<>();
        for (String city : cities) {
            if (city.toLowerCase().contains(searchText.toLowerCase()) || "*".equals(searchText) ) {
                results.add(city);
            }
        }
        return results;
    }
}
