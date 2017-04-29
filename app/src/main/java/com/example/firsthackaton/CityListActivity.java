package com.example.firsthackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;

import com.example.firsthackaton.adapters.CityAdapter;
import com.example.firsthackaton.models.City;
import com.example.firsthackaton.models.Data;
import com.example.firsthackaton.models.Departament;

import java.util.ArrayList;

public class CityListActivity extends AppCompatActivity {

    RecyclerView mCityList;
    Data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);

        mCityList = (RecyclerView) findViewById(R.id.cityRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mCityList.setLayoutManager(linearLayoutManager);
        mCityList.setHasFixedSize(true);

        mData = new Data();

        CityAdapter cityAdapter = new CityAdapter(mData.getCities(), new CityAdapter.OnCityListItemClickListener() {
            @Override
            public void onItemClick(String cityCode) {
                Log.v("example", cityCode);
                launchProjectActivity(cityCode);
            }
        });

        mCityList.setAdapter(cityAdapter);
    }

    private void launchProjectActivity(String cityCode) {
        Intent intent = new Intent(this, ProjectActivity.class);
        intent.putExtra("city-code", cityCode);
        startActivity(intent);
    }
}
