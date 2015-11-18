package com.example.pbhoot.test2;

import android.provider.BaseColumns;

/**
 * Created by pbhoot on 17/11/15.
 */
public class dbContract {
    public dbContract () {}

    public static abstract class tokenData implements BaseColumns {
        public static final String TABLE_NAME = "tokenData";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_TOKEN_NO = "token";
        public static final String COLUMN_NAME_PHONE = "phone";
        public static final String COLUMN_NAME_SIZE = "size";
        public static final String COLUMN_NAME_TIME_REG = "time_in";
        public static final String COLUMN_NAME_WAIT_TIME = "wait";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_NOTES = "notes";
        public static final String COLUMN_NAME_TIME_CALL = "time_call";
        public static final String COLUMN_NAME_CLOSURE = "closure";


    }

}
