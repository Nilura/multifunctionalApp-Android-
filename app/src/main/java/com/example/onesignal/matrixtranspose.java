package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.EditText;

public class matrixtranspose extends AppCompatActivity {
    private EditText num1,num2,num3,num4,num5,num6,num7,num8,num9;
    private String defaultval= "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrixtranspose);
        num1= findViewById(R.id.editText1);
        num2= findViewById(R.id.editText2);
        num3= findViewById(R.id.editText3);
        num4= findViewById(R.id.editText4);
        num5= findViewById(R.id.editText5);
        num6= findViewById(R.id.editText6);
        num7= findViewById(R.id.editText7);
        num8= findViewById(R.id.editText8);
        num9= findViewById(R.id.editText9);
        String number1=getIntent().getStringExtra("keynum1");
        String number2=getIntent().getStringExtra("keynum2");
        String number3=getIntent().getStringExtra("keynum3");
        String number4=getIntent().getStringExtra("keynum4");
        String number5=getIntent().getStringExtra("keynum5");
        String number6=getIntent().getStringExtra("keynum6");
        String number7=getIntent().getStringExtra("keynum7");
        String number8=getIntent().getStringExtra("keynum8");
        String number9=getIntent().getStringExtra("keynum9");
        num1.setText(number1);
        num2.setText(number4);
        num3.setText(number7);
        num4.setText(number2);
        num5.setText(number5);
        num6.setText(number8);
        num7.setText(number3);
        num8.setText(number6);
        num9.setText(number9);


    }
}