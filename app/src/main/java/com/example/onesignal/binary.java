package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class binary extends AppCompatActivity {
    private EditText num;
    private Button btnbinary;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        num=(EditText) findViewById(R.id.bin);
        btnbinary=(Button) findViewById(R.id.btnconvert);
        txt=(TextView) findViewById(R.id.tvshow);

        btnbinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(num.getText().toString());
                String binary=Integer.toBinaryString(number);
                String hexadecimal=Integer.toHexString(number);
                String octal=Integer.toOctalString(number);

               txt.setText("Binary:"+binary+"\nHexaDecimal:"+hexadecimal+"\nOctal:"+octal);
            }
        });
    }
}