package com.aae.medminder;

import android.app.Application;

import com.aae.medminder.database.DbOpenHelper;
import com.aae.medminder.models.DaoMaster;
import com.aae.medminder.models.DaoSession;

public class MedminderApp extends Application {
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        daoSession = new DaoMaster(new DbOpenHelper(this, "medminder.db").getWritableDb()).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}