package com.example.rohan_pc.sample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText[] t1 = new EditText[1];
        final EditText[] t2 = new EditText[1];

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1[0] = (EditText) findViewById(R.id.editText2);
                t2[0] = (EditText) findViewById(R.id.editText3);
                Integer n1,n2,sum;

                n1 = Integer.parseInt(t1[0].getText().toString().trim());
                n2 = Integer.parseInt(t2[0].getText().toString().trim());
                //sum = n1+n2;

                //Toast.makeText(getApplicationContext(),"Addition is "+sum,Toast.LENGTH_LONG).show();

                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                Bundle b = new Bundle();
                b.putInt("num1",n1);
                b.putInt("num2",n2);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
