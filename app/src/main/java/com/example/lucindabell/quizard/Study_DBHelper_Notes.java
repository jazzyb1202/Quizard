package com.example.lucindabell.quizard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.HashMap;

public class Study_DBHelper_Notes extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Notes.db";
    public static final String TABLE_NAME = "note_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Title";
    public static final String COL_3 = "Notes";

    public Cursor res, ans, cursor;
    //Create a database to store, retrieve and update the notes
    public Study_DBHelper_Notes(Context context){
        super(context, DATABASE_NAME, null, 1);


    }
//this creates the note database
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, NOTES TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
//This is the query where the note contents are added or even updated
    public boolean insertData(String title, String notes) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, title);
        contentValues.put(COL_3, notes);
        long result = db.insert(TABLE_NAME, null, contentValues);

        return result != -1;
    }
//This retrieves all the notes for them to be listed and overviewed
    public Cursor getNotes() {
        SQLiteDatabase db = this.getReadableDatabase();
        res = db.rawQuery("SELECT * FROM NOTE_TABLE", null);
        return res;
    }
//This deletes a note
    public Cursor deleteNote(String title){
        SQLiteDatabase db = this.getWritableDatabase();
        ans = db.rawQuery("DELETE FROM NOTE_TABLE WHERE TITLE = ?", new String[] {title});
        return ans;
    }

    //This retrieves the contents of the note based on what the title is
    public Cursor GetNotesContent(String title){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM NOTE_TABLE WHERE TITLE = ?";
        cursor = db.rawQuery(query, new String[] {title});
        return cursor;

    }}
