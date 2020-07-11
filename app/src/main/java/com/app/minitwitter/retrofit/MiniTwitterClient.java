package com.app.minitwitter.retrofit;

import com.app.minitwitter.common.Constantes;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MiniTwitterClient {
    private static MiniTwitterClient instance = null;
    private  MiniTwitterService miniTwitterService;
    private  Retrofit retrofit;

    public MiniTwitterClient() {
        retrofit = new Retrofit.Builder()
                    .baseUrl(Constantes.API_MINITWITTER_BASE_URL)  // endPoint
                    .addConverterFactory(GsonConverterFactory.create()) // convert json => java
                    .build();

        miniTwitterService = retrofit.create(MiniTwitterService.class);
    }

    // patron Singleton solo se instancia una vez
    public static  MiniTwitterClient getInstance(){
        if(instance == null){
            instance = new MiniTwitterClient();
        }

        return  instance;
    }

    // consumir servicios de la API
    public MiniTwitterService getMiniTwitterService(){
        return  miniTwitterService;
    }


}
