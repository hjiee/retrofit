package com.example.hj.retrofit.Retrofit.RetrofitInterface;

import com.example.hj.retrofit.Retrofit.RetrofitRepo;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("https://2018-anyfood-dev.workservice.kr:773/kr/test/test.php?act=dongju/")
    Call<RetrofitRepo> getGet(@Path("act") String act);

    @FormUrlEncoded
    @POST("https://2018-anyfood-dev.workservice.kr:773/kr/test/test.php/")
    Call<RetrofitRepo> getPost(@Path("act") String act);
}
