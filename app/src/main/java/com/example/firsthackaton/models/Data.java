/*
package com.example.firsthackaton.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.Random;


public class Data {

    private ArrayList<Project> mProjects;
    private ArrayList<House> mHouses;

    private String[] names = {"Cayenas", "El tucan", "El Prado", "Alameda", "Portal Gaitan"};
    private String[] addresses = {"Carrera 33 # 44 - 67", "Carrera 35 # 29 - 62", "Carrera 54 # 62 - 29", "Carrera 41 # 104 - 72", "Calle 72 # 27 - 90"};

    public Data() {
        Builder builder = new Builder();
        builder
        mProjects = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            int builderCode = generateRandomInteger(1, 3, new Random());
            House house = new House(2, 1, 45, 55);
            mProjects.add(new Project("1", names[i], "1", "1", addresses[i], true, true, true, house));
        }
    }

    private static int generateRandomInteger(int aStart, int aEnd, Random aRandom) {
        if (aStart > aEnd) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long) aEnd - (long) aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long) (range * aRandom.nextDouble());
        return (int) (fraction + aStart);
    }


}
*/

package com.example.firsthackaton.models;

import java.util.ArrayList;

public class Data {

    private ArrayList<Departament> mDepartaments;
    private ArrayList<City> mCities;
    private ArrayList<Builder> mBuilders;
    private ArrayList<Project> mProjects;
    private ArrayList<House> mHouses;

    public Data() {

        mDepartaments = new ArrayList<>();
        mDepartaments.add(new Departament("001", "Atlantico"));

        mCities = new ArrayList<>();
        mCities.add(new City("001-01", "Barranquilla", "001"));

        mBuilders = new ArrayList<>();
        mBuilders.add(new Builder("C01", "Marval S.A"));

        mProjects = new ArrayList<>();
        mProjects.add(new Project("P01", "Las cayenas", "Cra 7", true, 2, true, 1, true, 2, "001-01"));
        mProjects.add(new Project("P02", "Las palmas", "Cra 9", false, 0, true, 1, true, 1, "001-01"));

        mHouses = new ArrayList<>();
        mHouses.add(new House(3, 1, 50, 60, "H01"));
        mHouses.add(new House(5, 2, 60, 90, "H02"));

    }

    public ArrayList<Departament> getDepartaments() {
        return mDepartaments;
    }

    public void setDepartaments(ArrayList<Departament> departaments) {
        mDepartaments = departaments;
    }

    public ArrayList<City> getCities() {
        return mCities;
    }

    public void setCities(ArrayList<City> cities) {
        mCities = cities;
    }

    public ArrayList<Builder> getBuilders() {
        return mBuilders;
    }

    public void setBuilders(ArrayList<Builder> builders) {
        mBuilders = builders;
    }

    public ArrayList<Project> getProjects() {
        return mProjects;
    }

    public void setProjects(ArrayList<Project> projects) {
        mProjects = projects;
    }

    public ArrayList<House> getHouses() {
        return mHouses;
    }

    public void setHouses(ArrayList<House> houses) {
        mHouses = houses;
    }
}
