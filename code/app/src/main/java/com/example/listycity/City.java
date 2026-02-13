package com.example.listycity;

import java.util.Collections;
import java.util.List;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }
    /**
     * This checks if a city exists in the list
     * @param city
     * This is the city to check for
     * @return
     * Return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        List<Object> cities = Collections.emptyList();
        return false;
    }


    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }
}
