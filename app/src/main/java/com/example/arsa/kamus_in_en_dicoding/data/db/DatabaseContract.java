package com.example.arsa.kamus_in_en_dicoding.data.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    public static String TABLE_WORD_ID = "tbl_word_id";
    public static String TABLE_WORD_EN = "tbl_word_en";

    static class DictionaryColumn implements BaseColumns {
        static String COLOMN_WORD = "word";
        static String COLOMN_MEANS = "means";
    }

    static String sqlCreateTable(String tableName) {
        return "CREATE TABLE " + tableName + "( " +
                DictionaryColumn._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DictionaryColumn.COLOMN_WORD + " TEXT, " +
                DictionaryColumn.COLOMN_MEANS + " TEXT );";
    }

    static String sqlDeleteTable(String tableName) {
        return "DROP TABLE IF EXIST " + tableName;
    }
}
