package com.example.firsthackaton.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.firsthackaton.R;
import com.example.firsthackaton.models.City;
import com.example.firsthackaton.models.Project;

import java.util.ArrayList;

public class ProjectAdapter extends RecyclerView.Adapter {

    ArrayList<Project> mProjects;
    private OnProjectListItemClickListener mListener;

    public interface OnProjectListItemClickListener {
        void onItemClick(String projectCode);
    }

    public ProjectAdapter(ArrayList<Project> projects, OnProjectListItemClickListener listener) {
        mProjects = projects;
        mListener = listener;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.project_list_item, parent, false);
        viewHolder = new ProjectListViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ProjectListViewHolder viewHolder = (ProjectListViewHolder) holder;
        viewHolder.mProjectName.setText(mProjects.get(position).getName());
        Log.v("prject-adapter", mProjects.get(position).getCode());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("prject-adapter", mProjects.get(position).getCode());
                mListener.onItemClick(mProjects.get(position).getCode());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mProjects.size();
    }

    private class ProjectListViewHolder extends RecyclerView.ViewHolder {

        private TextView mProjectName;

        ProjectListViewHolder(View itemView) {
            super(itemView);
            mProjectName = (TextView) itemView.findViewById(R.id.projectNameTextView);
        }
    }
}
