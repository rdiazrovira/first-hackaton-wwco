package com.example.firsthackaton.models;

import java.util.ArrayList;

public class City {

    private String mCode;
    private String mName;
    private String mDepartamentCode;

    public City(String code, String name, String departamentCode) {
        mCode = code;
        mName = name;
        mDepartamentCode = departamentCode;
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
}
