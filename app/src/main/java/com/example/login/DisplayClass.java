package com.example.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
@SuppressLint("Registered")

public class DisplayClass extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.display);

            SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
            String display=preferences.getString("display","");

            TextView info=(TextView)findViewById(R.id.text);
            info.setText(display);
    }
}
