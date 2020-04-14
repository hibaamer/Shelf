package com.example.shelf;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class BookmarksDB extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="shelfapp_db.db";
    public static final String TABLE_NAME="Bookmarks";
    public static final String COL_ID="ID";
    public static final String COL_TITLE="ContentTitle";
    public static final String COL_IMAGE="ContentImage";
    // content image is an icon or clipart added by us
    public static final String STATUS_COL="BookmarkStatus";
    private static  String CREATE_TABLE= "CREATE TABLE " + TABLE_NAME+ "(" + COL_ID+ "TEXT" + COL_TITLE+ "TEXT"+ COL_IMAGE+"TEXT"+STATUS_COL+"TEXT)";


    public BookmarksDB(Context context) {
        super(context, DATABASE_NAME, null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //Empty table
    public void insertEmpty(){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues ContV= new ContentValues();
        for(int i=1 ; i <11 ; i++) {
            ContV.put(COL_ID, i);
            ContV.put(STATUS_COL, "0");
            db.insert(TABLE_NAME, null, ContV);
        }
    }


    //Insert data in database
    public void insertData(String id, String content_title, String content_image, String bookmark_status){
        SQLiteDatabase db;
        db=this.getWritableDatabase();
        ContentValues ContV;
        ContV = new ContentValues();
        ContV.put(COL_ID ,id);
        ContV.put(COL_TITLE ,content_title);
        ContV.put(COL_IMAGE , content_image);
        ContV.put(STATUS_COL, bookmark_status);
        db.insert(TABLE_NAME, null,ContV);
        Log.d("BookmarksDB status" , content_title + "BookmarkStatus - "+ bookmark_status+ " - ."+ ContV);

    }

    public Cursor Read_AllData(String id){
        SQLiteDatabase db;
        db=this.getReadableDatabase();
        String sql ="select * from " + TABLE_NAME +"where" + COL_ID+ "="+id+"";
        return db.rawQuery(sql, null,null);
    }

    public void Remove_Bookmark(String id ){
        SQLiteDatabase db;
        db=this.getWritableDatabase();
        String sql= "UPDATE" +TABLE_NAME+ "SET "+STATUS_COL+"='0' WHERE"+COL_ID+"="+id+"";
        db.execSQL(sql);
        Log.d("remove", id.toString());
    }

    public Cursor Selcet_AllBookmarks(){
        SQLiteDatabase db=this.getReadableDatabase();
        String sql= "SELECT * FROM "+ TABLE_NAME+"WHERE"+STATUS_COL+"='1'";
        return db.rawQuery(sql,null, null);
    }
}
