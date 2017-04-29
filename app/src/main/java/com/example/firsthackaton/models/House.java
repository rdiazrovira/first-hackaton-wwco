package com.example.firsthackaton.models;

class House {

    private int mNumberOfRooms;
    private int mNumberOfBathrooms;
    private int mPrivateArea;
    private int mBuiltArea;
    private String mProjectCode;

    public House(int numberOfRooms, int numberOfBathrooms, int privateArea, int builtArea, String projectCode) {
        mNumberOfRooms = numberOfRooms;
        mNumberOfBathrooms = numberOfBathrooms;
        mPrivateArea = privateArea;
        mBuiltArea = builtArea;
        mProjectCode = projectCode;
    }
}
