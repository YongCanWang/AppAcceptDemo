package com.example.administrator.exampledemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView c = (TextView) findViewById(R.id.sdsss);

        Intent intent = getIntent();
        if (intent.getFlags() == 101) {
            String data_str = intent.getStringExtra("data");
            c.setText("" + data_str);
        }

    }
}
