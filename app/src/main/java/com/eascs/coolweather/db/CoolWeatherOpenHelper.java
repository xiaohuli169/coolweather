package com.eascs.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rockjp on 8/5/16.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /*建省*/
    public static final String CREATE_PROVINCE = "create table Province (\" + \"id integer primary key autoincrement, \"\n" +
            "                    + \"province_name text, \"\n" +
            "                    + \"province_code text)";

    /*建市*/
    public static final String CREATE_CITY = "create table City (\"\n" +
            "                    + \"id integer primary key autoincrement, \"\n" +
            "                    + \"city_name text, \"\n" +
            "                    + \"city_code text, \"\n" +
            "                    + \"province_id integer)";

    /*建县*/
    public static final String CREATE_COUNTY = "create table County (\"\n" +
            "                    + \"id integer primary key autoincrement, \"\n" +
            "                    + \"county_name text, \"\n" +
            "                    + \"county_code text, \"\n" +
            "                    + \"city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_PROVINCE);
        sqLiteDatabase.execSQL(CREATE_CITY);
        sqLiteDatabase.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
