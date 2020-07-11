package com.app.minitwitter.retrofit;

import com.app.minitwitter.RequestLogin;
import com.app.minitwitter.RequestSignup;
import com.app.minitwitter.ResponseAuth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MiniTwitterService {

    //syncronismo
    @POST("/auth/login")
    Call<ResponseAuth> dologin(@Body RequestLogin requestLogin);
    //call => respuesta de la llamada asincrona

    @POST("/auth/singup")
    Call<ResponseAuth> doSignUp(@Body RequestSignup requestSignup);
}
