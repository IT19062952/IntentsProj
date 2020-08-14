package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnok;
    EditText txt1;
    EditText txt2;
    String no1;
    String no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = (Button) findViewById(R.id.btnok);
        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        no1 = txt1.getText().toString();
        no2 = txt2.getText().toString();

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence msg = "Sending message";
                int time = Toast.LENGTH_SHORT;

                LayoutInflater lay = getLayoutInflater();
                View layout = lay.inflate(R.layout.customtoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0, 0);
                toast.setView(layout);
                toast.show();

                no1 = txt1.getText().toString();
                no2 = txt2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("ex1",no1);
                intent.putExtra("ex2",no2);
                startActivity(intent);

            }
        });



    }
}