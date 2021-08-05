package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.firebase.installations.Utils;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class celsius extends AppCompatActivity implements SensorEventListener {
    Button b1;
    EditText et;
    ToggleButton tb;
    Double a;
    private SensorManager sensorManager;
    private Thermometer thermometer;
    private float temperature;
    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius);
        et=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);
        thermometer = (Thermometer) findViewById(R.id.thermometer);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        tb=(ToggleButton) findViewById(R.id.toggleButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et.getText().toString().isEmpty())
                {
                    Toast.makeText(celsius.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
                }

                else if(tb.isChecked())
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b=a*9/5+32;
                    String r=String.valueOf(b);
                    Toast.makeText(celsius.this,r+"°F",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b=a-32;
                    Double c=b*5/9;
                    String r=String.valueOf(c);
                    Toast.makeText(celsius.this,r+"°C",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        loadAmbientTemperature();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterAll();
    }

    private void simulateAmbientTemperature() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                temperature = Nw.randInt(-10, 35);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        thermometer.setCurrentTemp(temperature);
                        getSupportActionBar().setTitle(getString(R.string.app_name) + " : " + temperature);
                    }
                });
            }
        }, 0, 3500);
    }

    private void loadAmbientTemperature() {
        Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);

        if (sensor != null) {
            sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_FASTEST);
        } else {
            Toast.makeText(this, "No Ambient Temperature Sensor !", Toast.LENGTH_LONG).show();
        }
    }

    private void unregisterAll() {
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values.length > 0) {
            temperature = sensorEvent.values[0];
            thermometer.setCurrentTemp(temperature);
            getSupportActionBar().setTitle(getString(R.string.app_name) + " : " + temperature);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

