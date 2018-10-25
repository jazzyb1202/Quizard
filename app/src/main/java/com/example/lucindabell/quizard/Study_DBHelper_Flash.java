package com.example.lucindabell.quizard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Study_DBHelper_Flash extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Flashcards.db";
    public static final String TABLE_NAME = "card_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Keyword";
    public static final String COL_3 = "Notes";

//Create a database to store, retrieve and update the flashcards
    public Study_DBHelper_Flash(Context context){
        super(context, DATABASE_NAME, null, 1);


    }
//This creates the database
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, KEYWORD TEXT, NOTES TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
//This is where flashcard data is inserted or even updated
    public boolean insertData(String keyword, String notes) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, keyword);
        contentValues.put(COL_3, notes);
        long result = db.insert(TABLE_NAME, null, contentValues);

        return result != -1;
    }
//This allows for the randomisation of the flashcard viewing - it retrieves a random front card
    public Cursor getRandomKey() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT KEYWORD FROM CARD_TABLE ORDER BY RANDOM() LIMIT 1", null);
        return res;
    }

    //This provides the back of the card based on the front card displayed
    public Cursor getBack(String Keyword){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor ans = db.rawQuery("SELECT * FROM CARD_TABLE WHERE KEYWORD = ?", new String[] {Keyword});
        return ans;
    }


}




