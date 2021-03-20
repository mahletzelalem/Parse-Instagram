package com.androidstudioprojects.parseinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("R5CEblH4MgxFipoyngUJopQW7t22OeIqfwjS5G68")
                .clientKey("QCbQ7iFrT6HCQtJUwOoJzocqNJeiDwUZ1QqyykOc")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
