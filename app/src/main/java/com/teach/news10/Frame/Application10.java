package com.teach.news10.Frame;

import android.app.Application;
import android.content.Context;

/**
 * Created by 任小龙 on 2019/6/27.
 */
public class Application10 extends Application{

    public static Application10 sApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
    }
    
    public static Context getAppContext(){
        return sApplication.getApplicationContext();
    }

    public static Application10 getApplication() {
        return sApplication;
    }
}
