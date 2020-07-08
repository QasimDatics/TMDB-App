package com.example.tmdbapps;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {

    @POST("users/")
    Call<UserResponse> saveUser(@Body UserRequest userRequest);


    @GET("posts")
    Call<List<Posts>> posts();
}
