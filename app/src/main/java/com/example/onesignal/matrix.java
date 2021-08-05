package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class matrix extends AppCompatActivity {
private EditText num1,num2,num3,num4,num5,num6,num7,num8,num9;
private Button btn,clear,btntranspose,add,sub,mul;
private String defaultval= "0";
//private int number1=0, number2=0,number3=0,number4=0,number5=0,number6=0,number7=0,number8=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);
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
        btn=findViewById(R.id.btninv);
        sub=findViewById(R.id.btnsub);
        btntranspose=findViewById(R.id.btntrans);
        clear=findViewById(R.id.btncle);
        add=findViewById(R.id.btnaddition);
        mul=findViewById(R.id.btnmul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14=new Intent(matrix.this,multiply.class);
             String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                String  number3 =num3.getText().toString();
                String number4 = num4.getText().toString();
                String   number5 =num5.getText().toString();
                String  number6 = num6.getText().toString();
                String number7 = num7.getText().toString();
                String number8 = num8.getText().toString();
                String  number9 =num9.getText().toString();
                intent14.putExtra("keynum21",number1);
                intent14.putExtra("keynum22",number2);
                intent14.putExtra("keynum23",number3);
                intent14.putExtra("keynum24",number4);
                intent14.putExtra("keynum25",number5);
                intent14.putExtra("keynum26",number6);
                intent14.putExtra("keynum27",number7);
                intent14.putExtra("keynum28",number8);
                intent14.putExtra("keynum29",number9);

                startActivity(intent14);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
            }
        });
       sub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent13=new Intent(matrix.this,substraction.class);
        String number1 = num1.getText().toString();
        String number2 = num2.getText().toString();
        String  number3 =num3.getText().toString();
        String number4 = num4.getText().toString();
        String   number5 =num5.getText().toString();
        String  number6 = num6.getText().toString();
        String number7 = num7.getText().toString();
        String number8 = num8.getText().toString();
        String  number9 =num9.getText().toString();
        intent13.putExtra("keynum1",number1);
        intent13.putExtra("keynum2",number2);
        intent13.putExtra("keynum3",number3);
        intent13.putExtra("keynum4",number4);
        intent13.putExtra("keynum5",number5);
        intent13.putExtra("keynum6",number6);
        intent13.putExtra("keynum7",number7);
        intent13.putExtra("keynum8",number8);
        intent13.putExtra("keynum9",number9);

        startActivity(intent13);
        overridePendingTransition(R.anim.fade, R.anim.fadeout);
    }
});
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13=new Intent(matrix.this,addition.class);
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                String  number3 =num3.getText().toString();
                String number4 = num4.getText().toString();
                String   number5 =num5.getText().toString();
                String  number6 = num6.getText().toString();
                String number7 = num7.getText().toString();
                String number8 = num8.getText().toString();
                String  number9 =num9.getText().toString();

                intent13.putExtra("keynum1",number1);
                intent13.putExtra("keynum2",number2);
                intent13.putExtra("keynum3",number3);
                intent13.putExtra("keynum4",number4);
                intent13.putExtra("keynum5",number5);
                intent13.putExtra("keynum6",number6);
                intent13.putExtra("keynum7",number7);
                intent13.putExtra("keynum8",number8);
                intent13.putExtra("keynum9",number9);
                startActivity(intent13);
            }
        });
        btntranspose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent11=new Intent(matrix.this,matrixtranspose.class);
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                String  number3 =num3.getText().toString();
                String number4 = num4.getText().toString();
                String   number5 =num5.getText().toString();
                String  number6 = num6.getText().toString();
                String number7 = num7.getText().toString();
                String number8 = num8.getText().toString();
                String  number9 =num9.getText().toString();
                intent11.putExtra("keynum1",number1);
                intent11.putExtra("keynum2",number2);
                intent11.putExtra("keynum3",number3);
                intent11.putExtra("keynum4",number4);
                intent11.putExtra("keynum5",number5);
                intent11.putExtra("keynum6",number6);
                intent11.putExtra("keynum7",number7);
                intent11.putExtra("keynum8",number8);
                intent11.putExtra("keynum9",number9);

                startActivity(intent11);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num2.setText("");
                num3.setText("");
                num4.setText("");
                num5.setText("");
                num6.setText("");
                num7.setText("");
                num8.setText("");
                num9.setText("");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().isEmpty()&&num2.getText().toString().isEmpty()&&num3.getText().toString().isEmpty()&&num4.getText().toString().isEmpty()&&num5.getText().toString().isEmpty()&&num6.getText().toString().isEmpty()&&num7.getText().toString().isEmpty()&&num8.getText().toString().isEmpty()&&num9.getText().toString().isEmpty()){
                    Toast.makeText(matrix.this,"All are empty ",Toast.LENGTH_LONG).show();
                }
                else{
                    int number1 = Integer.parseInt(num1.getText().toString());
                 int number2 = Integer.parseInt(num2.getText().toString());
                    int  number3 = Integer.parseInt(num3.getText().toString());
                    int number4 = Integer.parseInt(num4.getText().toString());
                    int   number5 = Integer.parseInt(num5.getText().toString());
                    int  number6 = Integer.parseInt(num6.getText().toString());
                    int  number7 = Integer.parseInt(num7.getText().toString());
                    int  number8 = Integer.parseInt(num8.getText().toString());
                    int  number9 = Integer.parseInt(num9.getText().toString());
                    int det=number1*(number5*number9-number6*number8)-number4*(number2*number9-number3*number8)+number7*(number2*number6-number5*number3);
                    //  Toast.makeText(matrix.this,"Determinant is "+det,Toast.LENGTH_LONG).show();
                    Toast toast = Toast.makeText(matrix.this, "Determinant is "+det, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 50, 50);
                    toast.show();}

            }
        });


    }
}