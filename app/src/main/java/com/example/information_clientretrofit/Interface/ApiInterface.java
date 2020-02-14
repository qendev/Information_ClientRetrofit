package com.example.information_clientretrofit.Interface;

/*created by qendev on
* 14th 2020*/

/*for putting in all URL*/

import com.example.information_clientretrofit.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("films")
    Call<List<Movie>> getMovies();

}
