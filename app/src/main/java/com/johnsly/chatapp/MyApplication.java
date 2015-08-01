package com.johnsly.chatapp;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by root on 8/1/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this,"egiWvnLEugWUmGWTV43HajqADTKBteKZu2OvK9lx", "ew6D1BKRyBlXESei8DZwtN285fJ4z0zYKYVeALwL");
    }
}
