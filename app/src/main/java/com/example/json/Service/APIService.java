package com.example.json.Service;

import com.example.json.Model.LaundryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("toko-laundry-pengguna")
    Call<LaundryResponse> getLaundry ();
}
