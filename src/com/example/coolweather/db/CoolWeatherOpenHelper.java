package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version	) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	public static final String CREATE_PROVICE="create table Provice (id integer primary key autoincrement,"+
		      "province_name text,"+
		      "province_code text)";
	public static final String  CREATE_CITY="create table City (id integer primary key autoincrement,city_name text,city_code text, province_id integer)";
	public static final String  CREATE_COUNTRY="create table Country (id integer primary key autoincrement,country_name text,country_code text,city_id integer)";
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVICE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTRY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
