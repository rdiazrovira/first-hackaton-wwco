package com.example.firsthackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.firsthackaton.adapters.ProjectAdapter;
import com.example.firsthackaton.models.Data;
import com.example.firsthackaton.models.Project;

import java.util.ArrayList;

public class ProjectActivity extends AppCompatActivity {

    RecyclerView mProjectList;
    Data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        mProjectList = (RecyclerView) findViewById(R.id.projectRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mProjectList.setLayoutManager(linearLayoutManager);
        mProjectList.setHasFixedSize(true);


        mData = new Data();
        String cityCode = getIntent().getStringExtra("city-code");

        ArrayList<Project> projects = new ArrayList<>();
        for (int index = 0; index < mData.getProjects().size(); index++) {
            Log.v("example-project", mData.getProjects().get(index).getCityCode());
            if (mData.getProjects().get(index).getCityCode() == cityCode) {
                Log.v("example-project", mData.getProjects().get(index).getCityCode());
                projects.add(mData.getProjects().get(index));
            }
        }


        ProjectAdapter projectAdapter = new ProjectAdapter(mData.getProjects(), new ProjectAdapter.OnProjectListItemClickListener() {
            @Override
            public void onItemClick(String projectCode) {
                Log.v("example", projectCode);
                launchHouseActivity(projectCode);
            }
        });

        mProjectList.setAdapter(projectAdapter);


    }

    private void launchHouseActivity(String projectCode) {
        Intent intent = new Intent(this, HouseListActivity.class);
        intent.putExtra("project-code", projectCode);
        startActivity(intent);
    }
}
