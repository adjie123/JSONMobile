package com.example.json.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.json.Model.LaundryModel;
import com.example.json.R;

import java.util.ArrayList;
import java.util.List;

public class LaundryListAdapter extends RecyclerView.Adapter<LaundryListAdapter.MyViewHolder> {
    List<LaundryModel> laundryModels;

    public LaundryListAdapter(List <LaundryModel> laundryModelList) {
        laundryModels = laundryModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list_laundry, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvNama.setText(laundryModels.get(position).getNamaToko());
        holder.tvAddress.setText(laundryModels.get(position).getAlamatToko());
    }

    @Override
    public int getItemCount() {
        return laundryModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNama, tvAddress;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_name_laundry);
            tvAddress = itemView.findViewById(R.id.tv_address_laundry);
        }
    }
}
