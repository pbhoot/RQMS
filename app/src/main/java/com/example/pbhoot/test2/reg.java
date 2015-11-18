package com.example.pbhoot.test2;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();

        setContentView(R.layout.user_reg);

        TextView tv;
        String v1 = "5";
        tv = (TextView) findViewById(R.id.TextView2);
        tv.setText("2-"+v1);


    }

    public void q_add(View view){
        dbHelper tokendb = new dbHelper(this);
        EditText et;
        String ets;
        int temp = 0;
        ContentValues v = new ContentValues();
        //v.put(dbContract.tokenData.COLUMN_NAME_DATE, );

       //Token Number
        et = (EditText) findViewById(R.id.token_no);
        ets = et.getText().toString();
        try {
            v.put(dbContract.tokenData.COLUMN_NAME_TOKEN_NO,Integer.parseInt(ets));
        }catch(Exception e) {
            Log.e("data", "token number not a Number");
        }
        //phone number TODO "+91"
        et = (EditText) findViewById(R.id.phone_no);
        ets = et.getText().toString();
        try {
            v.put(dbContract.tokenData.COLUMN_NAME_PHONE,Integer.parseInt(ets));
        }catch(Exception e) {
            Log.e("data", "phone not a Number");
        }
        //size
        et = (EditText) findViewById(R.id.size);
        ets = et.getText().toString();
        try {
            v.put(dbContract.tokenData.COLUMN_NAME_SIZE,Integer.parseInt(ets));
        }catch(Exception e) {
            Log.e("data", "size not a Number");
        }
        //wait_time
        et = (EditText) findViewById(R.id.wait_time);
        ets = et.getText().toString();
        try {
            v.put(dbContract.tokenData.COLUMN_NAME_WAIT_TIME,Integer.parseInt(ets));
        }catch(Exception e) {
            Log.e("data", "wait_time not a Number");
        }
        //name
        et = (EditText) findViewById(R.id.name);
        ets = et.getText().toString();
        v.put(dbContract.tokenData.COLUMN_NAME_NAME,(ets));
        //notes
        et = (EditText) findViewById(R.id.notes);
        ets = et.getText().toString();
        v.put(dbContract.tokenData.COLUMN_NAME_NAME,(ets));

        tokendb.tokenInsert(v);
    }

    public void clear(View view) {
        EditText et;
        String ets;
        int temp = 0;
        ContentValues v = new ContentValues();
        et = (EditText) findViewById(R.id.token_no);
        et.setText("");

        et = (EditText) findViewById(R.id.phone_no);
        et.setText("");

        et = (EditText) findViewById(R.id.size);
        et.setText("");

        et = (EditText) findViewById(R.id.wait_time);
        et.setText("");

        et = (EditText) findViewById(R.id.name);
        et.setText("");

        et = (EditText) findViewById(R.id.notes);
        et.setText("");

    }

}
