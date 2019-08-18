package com.example.findplace;

import com.example.findplace.POJO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
//AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk

public interface RetrofitMaps {
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<Example> getNearbyPlaces(@Query("type")String type,@Query("location")String location,@Query("radius")int radius);
}
