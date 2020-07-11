package com.app.minitwitter.common;

import android.app.Application;
import android.content.Context;
/// obtener el contexto de la app dsde cualquier lugar
public class MyApp extends Application {
    private static MyApp instance;

    public static MyApp getInstance(){
        return  instance;
    }

    public static Context getContext(){
        return instance;
    }

    //singleton

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}
