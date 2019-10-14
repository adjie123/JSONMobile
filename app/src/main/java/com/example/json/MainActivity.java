package com.example.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.json.Adapter.LaundryListAdapter;
import com.example.json.Model.LaundryModel;
import com.example.json.Model.LaundryResponse;
import com.example.json.Network.LaundryClient;
import com.example.json.Service.APIService;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private APIService apiService;
    private RecyclerView recyclerView;
    private LaundryListAdapter laundryListAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
    }

    private void initComponent(){
        recyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        apiService = LaundryClient.getClient().create(APIService.class);

        loadData();
    }


    private void loadData(){
        Call<LaundryResponse> laundryResponseCall = apiService.getLaundry();
        laundryResponseCall.enqueue(new Callback<LaundryResponse>() {
            @Override
            public void onResponse(Call<LaundryResponse> call, Response<LaundryResponse> response) {
                List<LaundryModel> laundryModelList = response.body().getLaundryModelList();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(laundryModelList.size()));
                laundryListAdapter = new LaundryListAdapter(laundryModelList);
                recyclerView.setAdapter(laundryListAdapter);
            }

            @Override
            public void onFailure(Call<LaundryResponse> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}
