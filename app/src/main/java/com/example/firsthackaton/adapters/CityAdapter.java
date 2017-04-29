package com.example.firsthackaton.adapters;

import android.bluetooth.BluetoothDevice;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firsthackaton.R;
import com.example.firsthackaton.models.City;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter {

    ArrayList<City> mCities;
    private OnCityListItemClickListener mListener;

    public interface OnCityListItemClickListener {
        void onItemClick(String cityCode);
    }

    public CityAdapter(ArrayList<City> cities, OnCityListItemClickListener listener) {
        mCities = cities;
        mListener = listener;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.city_list_item, parent, false);
        viewHolder = new CityListViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        CityListViewHolder viewHolder = (CityListViewHolder) holder;
        viewHolder.mCityName.setText(mCities.get(position).getName());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClick(mCities.get(position).getCode());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCities.size();
    }

    private class CityListViewHolder extends RecyclerView.ViewHolder {

        private TextView mCityName;

        CityListViewHolder(View itemView) {
            super(itemView);
            mCityName = (TextView) itemView.findViewById(R.id.cityNameTextView);
        }
    }
}
