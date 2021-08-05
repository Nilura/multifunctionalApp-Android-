package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class stopwatch extends AppCompatActivity {
private Chronometer chronometer;
public boolean running;
private long pauseoffset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        chronometer = findViewById(R.id.chron);
        chronometer.setFormat("Time:%s");
        chronometer.setBase(SystemClock.elapsedRealtime());

/*
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if (SystemClock.elapsedRealtime() - chronometer.getBase() >= 10000) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(stopwatch.this, "bing!", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
    public void startChronmeter(View v){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime()-pauseoffset);
            chronometer.start();
            running=true;
        }
    }
    public void pauseChronmeter(View v){
        if(!running){
            chronometer.stop();
            pauseoffset=SystemClock.elapsedRealtime()-chronometer.getBase();
            running=false;
        }
    }
    public void resetChronmeter(View v){
chronometer.setBase(SystemClock.elapsedRealtime());
pauseoffset=0;
    }

}