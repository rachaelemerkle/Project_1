package com.shift.android.beautifulbulldog;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by racha on 9/24/2017.
 */

public class BulldogApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Realm.init(this);
    }
}
