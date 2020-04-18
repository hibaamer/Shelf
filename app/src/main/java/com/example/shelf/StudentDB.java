package com.example.shelf;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StudentDB extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="shelfapp_db.db";
    public static final String TABLE_NAME= "USER_ACCOUNT";
    public static final String COL_1="username";
    public static final String COL_2="password";
    public static final String COL_3="email";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = " CREATE TABLE USER_ACCOUNT (username TEXT PRIMARY KEY not null , "
            + "password TEXT not null , email TEXT not null);";

    public StudentDB(Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS TABLE_CREATE";
        db.execSQL(query);
        this.onCreate(db);
    }

    public long AddUser (String User , String Pass){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username" , User );
        contentValues.put("password" , Pass );
        long res = db.insert("USER_ACCOUNT" , null , contentValues);
        db.close();
        return res;
    }

    public boolean CheckUser(String Username , String Password) {
        String[] columns = { COL_1 };
        SQLiteDatabase db = getReadableDatabase();
        String selection = COL_2 + "=?" + "AND" + COL_3 + "=?";
        String[] selectionArgs ={ Username , Password };
        Cursor cursor = db.query(TABLE_NAME,columns,selection,selectionArgs,null,null,null);
        int count = cursor.getCount();
        cursor.close();
        db.close();
        if (count>0)
            return true;
        else
            return false;
    }
}