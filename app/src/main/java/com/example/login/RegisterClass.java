package com.example.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
@SuppressLint("Registered")

public class RegisterClass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText user=(EditText)findViewById(R.id.user);
        final EditText pass=(EditText)findViewById(R.id.pass);
        final EditText cpassword=(EditText)findViewById(R.id.cpassword);
        Button reg=(Button) findViewById(R.id.reg);




        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String us=user.getText().toString();
                String pw=pass.getText().toString();
                String cpass=cpassword.getText().toString();

                SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);


                SharedPreferences.Editor editor= preferences.edit();

                editor.putString(us + pw  + "data" ,us);
                editor.commit();


                Intent intent3=new Intent(RegisterClass.this,MainActivity.class);
                startActivity(intent3);
            }
        });




}
    }
