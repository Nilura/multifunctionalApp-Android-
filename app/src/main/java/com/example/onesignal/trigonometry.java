package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class trigonometry extends AppCompatActivity {
    private EditText num1;
    // private EditText num2;

    private Button clear;
    private Switch aSwitch;
    private TextView result;
    private Button sin;
    RadioButton sinradioButton, cosradioButton, tanradioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometry);
        sinradioButton = (RadioButton) findViewById(R.id.radioButton1);
        cosradioButton = (RadioButton) findViewById(R.id.radioButton2);
        tanradioButton = (RadioButton) findViewById(R.id.radioButton3);
        num1=(EditText)findViewById(R.id.etNum1);
        // num2=(EditText)findViewById(R.id.etNum2);
        result=(TextView)findViewById(R.id.tvAnswer);
        clear=(Button)findViewById(R.id.btnclear);
        sin=(Button)findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(num1.getText().toString())) {
                    Toast.makeText(trigonometry.this,"Empty",Toast.LENGTH_SHORT).show();
                }else {
                    double amount = Integer.parseInt(num1.getText().toString());
                    double radians = Math.toRadians(amount);
                    double val1= Math.sin(radians);
                    double val2= Math.cos(radians);
                    double val3= Math.tan(radians);
                    //    result.setText(String.valueOf(val1));

                    if (sinradioButton.isChecked()) {
                        result.setText(String.valueOf(val1));

                    } else if (cosradioButton.isChecked()) {
                        result.setText(String.valueOf(val2));

                    } else if (tanradioButton.isChecked()) {
                        result.setText(String.valueOf(val3));
                        // cosradioButton.setChecked(false);
                        //sinradioButton.setChecked(false);
                    }
                    // Toast.makeText(getApplicationContext(), "nothing", Toast.LENGTH_LONG).show(); // print the value of selected super star
                }}

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
                //   num2.setText("");
                sinradioButton.setChecked(false);
                cosradioButton.setChecked(false);
                tanradioButton.setChecked(false);
                //  }
            }
        });
    }

}