package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a list of cities and provides operations to manage them.
 */
public class CityList {

    /**
     * The list that stores all cities.
     */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     *
     * @param city the city to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities.
     *
     * @return a sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a city exists in the list.
     *
     * @param city the city to check
     * @return true if the city exists in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list.
     *
     * @param city the city to delete
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("The city is not in the list");
        }
        cities.remove(city);
    }
}
