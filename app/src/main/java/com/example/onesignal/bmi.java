package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button div;
    private Button sub;
    private Button mul;
    private Button clear;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText)findViewById(R.id.etNum2);
        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        div=(Button)findViewById(R.id.btndiv);
        mul=(Button)findViewById(R.id.btnmul);
        result=(TextView)findViewById(R.id.tvAnswer);
        clear=(Button)findViewById(R.id.btnclear);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num1.getText().toString())) {
                    Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(num2.getText().toString())){
                    Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();

                }
                else {
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int sum = number1 + number2;
                    result.setText(String.valueOf(sum));
                }
            }
        });
        sub.setOnClickListener(v -> {

            if (TextUtils.isEmpty(num1.getText().toString())) {
                Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();
            }
            else if(TextUtils.isEmpty(num2.getText().toString())){
                Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();

            }
            else {
                int number3 = Integer.parseInt(num1.getText().toString());
                int number4 = Integer.parseInt(num2.getText().toString());
                int sum1 = number3 - number4;
                result.setText(String.valueOf(sum1));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num1.getText().toString())) {
                    Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(num2.getText().toString())){
                    Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();

                }
                else{
                    int number5 = Integer.parseInt(num1.getText().toString());
                    int number6 = Integer.parseInt(num2.getText().toString());
                    int sum2 = number5 * number6;
                    result.setText(String.valueOf(sum2));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num1.getText().toString())) {
                    Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(num2.getText().toString())){
                    Toast.makeText(bmi.this,"Empty",Toast.LENGTH_SHORT).show();

                }
                else {
                    int number7 = Integer.parseInt(num1.getText().toString());
                    int number8 = Integer.parseInt(num2.getText().toString());
                    double sum3 = Double.valueOf(number7) / Double.valueOf(number8);
                    result.setText(String.valueOf(sum3));
                } }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   if (TextUtils.isEmpty(num1.getText().toString())) {
                    Toast.makeText(MainActivity.this,"Empty",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(num2.getText().toString())){
                    Toast.makeText(MainActivity.this,"Empty",Toast.LENGTH_SHORT).show();
                }*/
                // else {
                result.setText("");
                num1.setText("");
                num2.setText("");

                //  }
            }
        });
    }
}