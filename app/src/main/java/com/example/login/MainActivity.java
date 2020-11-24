package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username=(EditText)findViewById(R.id.username);
        final EditText password=(EditText)findViewById(R.id.password);
        Button btnregister=(Button) findViewById(R.id.btnregister);
        Button btnlogin=(Button) findViewById(R.id.btnlogin);



        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,RegisterClass.class);
                startActivity(intent2);
            }
        });




        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String UN=username.getText().toString();
                String PW=password.getText().toString();
                SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
                String Detail=preferences.getString(UN + PW + "data","Username And Password is INCORRECT !");

                SharedPreferences.Editor editor= preferences.edit();

                editor.putString("display",Detail);
                editor.commit();


                Intent intent=new Intent(MainActivity.this,DisplayClass.class);
                startActivity(intent);
            }
        });




    }
}
