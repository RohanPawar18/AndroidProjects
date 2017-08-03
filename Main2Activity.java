package com.example.rohan_pc.sample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv;
        Intent i = getIntent();
        Bundle b = i.getExtras();

        tv = (TextView) findViewById(R.id.textView3);
        if(b!=null)
        {
            int n1 = b.getInt("num1",-1);
            int n2 = b.getInt("num2",-1);
            int sum = n1+n2;
            tv.setText(""+sum);
        }
    }
}
