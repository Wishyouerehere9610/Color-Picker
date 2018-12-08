package com.example.administrator.test;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

public class MyApplication extends Application { 
    private DaoMaster.DevOpenHelper mHelper;

    private SQLiteDatabase db;

 private DaoMaster mDaoMaster;
 private DaoSession mDaoSession;

         public static MyApplication instances;
 @Override
 public void onCreate() {
 super.onCreate();
 instances = this;
 setDatabase();
 }
 public static MyApplication getInstances(){
 return instances;
 }

 /**
  * greenDao
  */
         private void setDatabase() {

 mHelper = new DaoMaster.DevOpenHelper(this, "sport-db", null);
 db = mHelper.getWritableDatabase();

 mDaoMaster = new DaoMaster(db);
 mDaoSession = mDaoMaster.newSession();
 }
 public DaoSession getDaoSession() {
 return mDaoSession;
 }
 public SQLiteDatabase getDb() {
 return db;
 }
}
