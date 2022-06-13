package com.elmeradrianv.instagramcloneapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;

public class ParseApplication extends Application {
    private String applicationId= "qNuBBZBDOrsmwdfAkWb7YfckrO51nSkFLLokyUKS";
    private String clientKey = "sb8MEBGqfGlWI48VnjURMYhCoS7gDS4pL1MPugPR";
    private String server = "https://parseapi.back4app.com/";
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(applicationId)
                .clientKey(clientKey)
                .server(server).build());

    }
}
