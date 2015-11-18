package com.example.pbhoot.test2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.util.Log;


/**
 * Created by pbhoot on 17/11/15.
 */

public class dbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "Token.db";

    private static final String TAG = "abc";

    private static final String TEXT_TYPE = " TEXT";
    private static final String NUM_TYPE = " INTEGER";
    private static final String DATE_TYPE = " DATE";
    private static final String TIME_TYPE = " DATETIME";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + dbContract.tokenData.TABLE_NAME + " (" +
                    dbContract.tokenData._ID + " INTEGER PRIMARY KEY," +
                    dbContract.tokenData.COLUMN_NAME_DATE + DATE_TYPE + " DEFAULT CURRENT_DATE" + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_TOKEN_NO + NUM_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_PHONE + NUM_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_SIZE + NUM_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_TIME_REG + TIME_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_WAIT_TIME + NUM_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_NOTES + TEXT_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_TIME_CALL + TIME_TYPE + COMMA_SEP +
                    dbContract.tokenData.COLUMN_NAME_CLOSURE + NUM_TYPE +
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + dbContract.tokenData.TABLE_NAME;

    public dbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public long tokenInsert(ContentValues values) {
        long newRowId;
        SQLiteDatabase db = this.getWritableDatabase();

        db.beginTransaction();
        try {
            newRowId = db.insert(
                    dbContract.tokenData.TABLE_NAME,
                    null,
                    values);
            db.setTransactionSuccessful();
            return newRowId;
        } catch (Exception e) {
            Log.d(TAG, "Error writing to db " + e);
            return -1;
        }
        finally {
            db.endTransaction();
        }

    }


}
