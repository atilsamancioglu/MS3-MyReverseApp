package com.atilsamancioglu.myreverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView1 = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        textView1.setText("Hello World");
        textView2.setText("Hello World2");


    }


}
