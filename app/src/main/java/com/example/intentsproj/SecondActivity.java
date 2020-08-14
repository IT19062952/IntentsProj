package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    String num1;
    String num2;
    Button btnplus;
    Button btnmin;
    Button btnmulti;
    Button btndivide;
    TextView ans;
    EditText t1;
    EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btnplus = (Button) findViewById(R.id.btnplus);
        btnmin = (Button) findViewById(R.id.btnmin);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btndivide = (Button) findViewById(R.id.btndivide);

        Intent intent = getIntent();
        num1 = intent.getStringExtra("ex1");
        num2 = intent.getStringExtra("ex2");

        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);

        t1.setText(num1);
        t2.setText(num2);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });

        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                substraction();
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muliplication();
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divide();
            }
        });
    }
    public void add(){

        double number1 = Double.parseDouble(t1.getText().toString());
        double number2 = Double.parseDouble(t2.getText().toString());

        double answer = number1 + number2;
        String a = Double.toString(answer);
        ans.setText(a);
    }

    public void substraction(){

        double number1 = Double.parseDouble(t1.getText().toString());
        double number2 = Double.parseDouble(t2.getText().toString());
        double answer = number1 - number2;
        String a = Double.toString(answer);
        ans.setText(a);
    }
    public void muliplication(){

        double number1 = Double.parseDouble(t1.getText().toString());
        double number2 = Double.parseDouble(t2.getText().toString());
        double answer = number1 * number2;
        String a = Double.toString(answer);
        ans.setText(a);
    }

    public void divide(){

        double number1 = Double.parseDouble(t1.getText().toString());
        double number2 = Double.parseDouble(t2.getText().toString());
        double answer = number1 / number2;
        String a = Double.toString(answer);
        ans.setText(a);
    }



    }
