package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class matricsinterface extends AppCompatActivity {
Button determinant,add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matricsinterface);
        determinant=findViewById(R.id.btndet);
        add=findViewById(R.id.btnadd);
        determinant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent25=new Intent(matricsinterface.this,matrix.class);
                startActivity(intent25);
            }
        });
    }
}