package com.example.administrator.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/12/21.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /*
    Province建表语句
     */
    public static final String CREATE_PROVINCE="create table Province("
            +"id integer primary key antoincrement,"
            +"province_name text,"
            +"province_code text)";
    /*
    City建表语句
     */
    public static final String CREATE_CITY="create table City("
            +"id integer primary key antoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
    /*
    Country建表语句
     */
    public static final String CREATE_COUNTRY="create table Country("
            +"id integer primary key antoincrement,"
            +"country_name text,"
            +"country_code text,"
            +"city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
