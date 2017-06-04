package com.ahdmuhajir.rambulalulintas.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.ahdmuhajir.rambulalulintas.model.Rambu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahdmuhajir on 19/05/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DBNAME ="indo_sign.db";
    public static final String DBLOCATION ="/data/data/com.ahdmuhajir.rambulalulintas/database/";
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public DatabaseHelper(Context context) {
        super(context, DBNAME, null, 1);
        this.mContext = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void openDatabase(){
        String dbPath = mContext.getDatabasePath(DBNAME).getPath();
        if (mDatabase != null && mDatabase.isOpen()){
            return;
        }
        mDatabase= SQLiteDatabase.openDatabase(dbPath,null,SQLiteDatabase.OPEN_READWRITE);
    }
    public void databaseClose(){
        if (mDatabase != null){
            mDatabase.close();
        }
    }
    public List<Rambu> getListRambu(){
        Rambu rambu =null;
        List<Rambu> rambuList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("select * from sign",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            rambu = new Rambu(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getBlob(3),cursor.getString(4));
            rambuList.add(rambu);
            cursor.moveToNext();
        }
        cursor.close();
        databaseClose();
        return rambuList;
    }
    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }
    public List<Rambu> getListData(){
        Rambu rambu= null;
        List <Rambu> listData = new ArrayList<>();
        openDatabase();
        Cursor cursor= mDatabase.rawQuery("select * from sign",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            rambu = new Rambu(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getBlob(3),cursor.getString(4));
            listData.add(rambu);
            cursor.moveToNext();
        }
        cursor.close();
        databaseClose();

        return listData;
    }
}
