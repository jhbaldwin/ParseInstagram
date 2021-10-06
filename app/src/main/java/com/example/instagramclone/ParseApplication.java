package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("H05uOYMJP0GzTTS6MtcYxYtgDoovmUcN942TKL3r")
                .clientKey("E8UqXVsKKtMCqYjh5fTO4MtEtRRNZHuykHmlzQkH")
                .server("https://parseapi.back4app.com").build()
        );
    }
}
