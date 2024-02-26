package com.example.studapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Student.db";
    public static final String TABLE_NAME="Student_Table";

    public static final String COL_1="ID";
    public static final String COL_2="USER_NAME";
    public static final String COL_3="PASSWORD";

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,USER_NAME TEXT,PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }


    public Boolean insertData(String unm, String pass) {
        if(!isValueExist(unm,pass)) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COL_2, unm);
            cv.put(COL_3, pass);
            long result = db.insert(TABLE_NAME, null, cv);
            db.close();
            return result != -1;
        }else
        {
            return false;
        }
    }
     public boolean isValueExist(String unm, String pass)
     {
         String query = "SELECT * FROM " + TABLE_NAME + " WHERE " + COL_2 + " = ? AND " + COL_3 + " = ? ";
         String[] whereArgs = {unm,pass};

         SQLiteDatabase db = this.getReadableDatabase();
         Cursor cursor = db.rawQuery(query, whereArgs);

         int count = cursor.getCount();

         cursor.close();

         return count >= 1;
     }


}
