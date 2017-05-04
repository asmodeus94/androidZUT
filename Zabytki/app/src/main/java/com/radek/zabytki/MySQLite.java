package com.radek.zabytki;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Radek on 04.05.2017.
 */

public class MySQLite extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "monumentsDB";
    private static final String TABLE_NAME = "monuments";

    public MySQLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String DATABASE_CREATE =
                "create table " + TABLE_NAME + " " +
                        "(_id integer primary key autoincrement," +
                        "name text not null," +
                        "description text not null," +
                        "longitude real not null," +
                        "latitude real not null);";
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }

    public void dodaj(Monument monument) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", monument.getName());
        values.put("description", monument.getDescription());
        values.put("longitude", monument.getLongitude());
        values.put("latitude", monument.getLatitude());
        db.insert(TABLE_NAME, null, values);
    }

    public void usun(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, "_id = ?", new String[]{id});
    }

    public int aktualizuj(Monument monument) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", monument.getName());
        values.put("description", monument.getDescription());
        values.put("longitude", monument.getLongitude());
        values.put("latitude", monument.getLatitude());
        int i = db.update(TABLE_NAME, values, "_id = ?", new String[]{String.valueOf(monument.getId())});
        db.close();
        return i;
    }

    public Monument pobierz(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =
                db.query(TABLE_NAME,
                        new String[]{"_id",
                                "name", "description", "longitude", "latitude"},
                        " id = ?", // selections
                        new String[]{
                                String.valueOf(id)}, // selections args
                        null, // group by
                        null, // having
                        null, // order by
                        null); // limit
        if (cursor != null) {
            cursor.moveToFirst();
        }
        Monument monument = new Monument(
                cursor.getString(1), cursor.getString(2), cursor.getFloat(3), cursor.getFloat(4)
        );
        monument.setId(Integer.parseInt(cursor.getString(0)));
        return monument;
    }

    public Cursor lista(){
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("Select * from " + TABLE_NAME, null);
    }
}
