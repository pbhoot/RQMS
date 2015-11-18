package com.example.pbhoot.test2;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void q(View view) {
        // Do something in response to button click

    }

    public void reg(View view) {
        // Do something in response to button click
        Intent intent = new Intent(this, reg.class);
        startActivity(intent);
    }

    public void stat(View view) {
        // Do something in response to button click

    }
}
