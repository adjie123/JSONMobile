package com.example.json.Network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.json.Utils.APIUtils.BASE_URL;

public class LaundryClient {
    private static Retrofit retrofit = null;
    private static String token = "$2y$10$Thpga9swILQRAPk8Y6/rVe9H/dGa.yLkTSA0fmJGnUfw7tBxtZd46";//pengguna
    private static String token_kurir = "$2y$10$0IPLFmW.bYmEQFAbsHcffOKmEP4z5Ojw.E9pze0xsBhoREUwnqQxO";//kurir

    public static Retrofit getClient() {
        if (retrofit==null) {
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request newRequest  = chain.request().newBuilder()
                            .addHeader("Authorization", "Bearer " + token)
                            .build();
                    return chain.proceed(newRequest);
                }
            }).build();


            retrofit = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
