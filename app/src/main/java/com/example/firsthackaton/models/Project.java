package com.example.firsthackaton.models;

import java.util.ArrayList;

public class Project {

    private String mCode;
    private String mName;
    private String mBuilderCode;
    private String mCityCode;
    private String mAddress;
    private boolean mPools;
    private int mNumberOfPools;
    private boolean mGym;
    private int mNumberOfGym;
    private boolean mEventHall;
    private int mNumberOfEventHalls;


    public Project(String code, String name,
                   String address, boolean pools, int numberOfPools, boolean gym,
                   int numberOfGym, boolean eventHall, int numberOfEventHalls, String cityCode) {
        mCode = code;
        mName = name;
        mAddress = address;
        mPools = pools;
        mNumberOfPools = numberOfPools;
        mGym = gym;
        mNumberOfGym = numberOfGym;
        mEventHall = eventHall;
        mNumberOfEventHalls = numberOfEventHalls;
        mCityCode = cityCode;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getBuilderCode() {
        return mBuilderCode;
    }

    public void setBuilderCode(String builderCode) {
        mBuilderCode = builderCode;
    }

    public String getCityCode() {
        return mCityCode;
    }

    public void setCityCode(String cityCode) {
        mCityCode = cityCode;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public boolean isPools() {
        return mPools;
    }

    public void setPools(boolean pools) {
        mPools = pools;
    }

    public int getNumberOfPools() {
        return mNumberOfPools;
    }

    public void setNumberOfPools(int numberOfPools) {
        mNumberOfPools = numberOfPools;
    }

    public boolean isGym() {
        return mGym;
    }

    public void setGym(boolean gym) {
        mGym = gym;
    }

    public int getNumberOfGym() {
        return mNumberOfGym;
    }

    public void setNumberOfGym(int numberOfGym) {
        mNumberOfGym = numberOfGym;
    }

    public boolean isEventHall() {
        return mEventHall;
    }

    public void setEventHall(boolean eventHall) {
        mEventHall = eventHall;
    }

    public int getNumberOfEventHalls() {
        return mNumberOfEventHalls;
    }

    public void setNumberOfEventHalls(int numberOfEventHalls) {
        mNumberOfEventHalls = numberOfEventHalls;
    }
}