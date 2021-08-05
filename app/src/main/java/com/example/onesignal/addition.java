package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class addition extends AppCompatActivity {
    private EditText num1,num2,num3,num4,num5,num6,num7,num8,num9;
    private Button done;
    private String defaultval= "0";

   private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        num1= findViewById(R.id.editText1);
        num1.setText(defaultval);
        num2= findViewById(R.id.editText2);
        num2.setText(defaultval);
        num3= findViewById(R.id.editText3);
        num3.setText(defaultval);
        num4= findViewById(R.id.editText4);
        num4.setText(defaultval);
        num5= findViewById(R.id.editText5);
        num5.setText(defaultval);
        num6= findViewById(R.id.editText6);
        num6.setText(defaultval);
        num7= findViewById(R.id.editText7);
        num7.setText(defaultval);
        num8= findViewById(R.id.editText8);
        num8.setText(defaultval);
        num9= findViewById(R.id.editText9);
        num9.setText(defaultval);
        done=findViewById(R.id.btnaddition);

       int number11=Integer.parseInt(getIntent().getStringExtra("keynum1"));
        int number12=Integer.parseInt(getIntent().getStringExtra("keynum2"));
        int number13=Integer.parseInt(getIntent().getStringExtra("keynum3"));
        int number14=Integer.parseInt(getIntent().getStringExtra("keynum4"));
        int number15=Integer.parseInt(getIntent().getStringExtra("keynum5"));
        int number16=Integer.parseInt(getIntent().getStringExtra("keynum6"));
        int number17=Integer.parseInt(getIntent().getStringExtra("keynum7"));
        int number18=Integer.parseInt(getIntent().getStringExtra("keynum8"));
        int number19=Integer.parseInt(getIntent().getStringExtra("keynum9"));
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


          /*
              */
                Intent intent11=new Intent(addition.this,resultaddition.class);
                /*
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                String  number3 =num3.getText().toString();
                String number4 = num4.getText().toString();
                String   number5 =num5.getText().toString();
                String  number6 = num6.getText().toString();
                String number7 = num7.getText().toString();
                String number8 = num8.getText().toString();
                String  number9 =num9.getText().toString();*/

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int  number3 = Integer.parseInt(num3.getText().toString());
                int number4 = Integer.parseInt(num4.getText().toString());
                int   number5 = Integer.parseInt(num5.getText().toString());
                int  number6 = Integer.parseInt(num6.getText().toString());
                int  number7 = Integer.parseInt(num7.getText().toString());
                int  number8 = Integer.parseInt(num8.getText().toString());
                int  number9 = Integer.parseInt(num9.getText().toString());
                int number31=number1+number11;
                int number32=  number2+number12;
                int number33=number3+number13;
                int number34=  number4+number14;
                int number35=number5+number15;
                int number36=  number6+number16;
                int number37=number7+number17;
                int number38=  number8+number18;
                int number39=number9+number19;
                String n1=Integer.toString(number31);
                String n2=Integer.toString(number32);
                String n3=Integer.toString(number33);
                String n4=Integer.toString(number34);
                String n5=Integer.toString(number35);
                String n6=Integer.toString(number36);
                String n7=Integer.toString(number37);
                String n8=Integer.toString(number38);
                String n9=Integer.toString(number39);
                intent11.putExtra("keynum11",n1);
                intent11.putExtra("keynum12",n2);
                intent11.putExtra("keynum13",n3);
                intent11.putExtra("keynum14",n4);
                intent11.putExtra("keynum15",n5);
                intent11.putExtra("keynum16",n6);
                intent11.putExtra("keynum17",n7);
                intent11.putExtra("keynum18",n8);
                intent11.putExtra("keynum19",n9);
               startActivity(intent11);
              //  Toast.makeText(addition.this,"addition"+n1,Toast.LENGTH_LONG).show();
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
            }
        });
    }
}