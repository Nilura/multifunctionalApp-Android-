package com.example.onesignal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    private static final String ONESIGNAL_APP_ID = "bfd4b840-a526-4322-b2f2-5d5d786cf318";
 CardView cardtemp;
    CardView cardstop;
    CardView cardcal;
    CardView cardbinary;
    CardView card1;
    CardView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardbinary =  findViewById(R.id.binary);
        cardcal = findViewById(R.id.cal);
        cardstop =findViewById(R.id.stop);
        cardtemp=findViewById(R.id.temp);
        card1=findViewById(R.id.calculator);
        card2=findViewById(R.id.new1);
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent25=new Intent(MainActivity.this,calculator.class);
                startActivity(intent25);
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22=new Intent(MainActivity.this,matrix.class);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
                startActivity(intent22);
            }
        });
     cardtemp.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent3=new Intent(MainActivity.this,binary.class);
             overridePendingTransition(R.anim.fade, R.anim.fadeout);
             startActivity(intent3);
             overridePendingTransition(R.anim.fade, R.anim.fadeout);
         }
     });
        cardstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11=new Intent(MainActivity.this,trigonometry.class);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
                startActivity(intent11);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
            }
        });
        cardbinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13=new Intent(MainActivity.this,celsius.class);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
                startActivity(intent13);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
            }
        });
        cardcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent31=new Intent(MainActivity.this,stopwatch.class);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
                startActivity(intent31);
                overridePendingTransition(R.anim.fade, R.anim.fadeout);
            }
        });

  /*      aSwitch = findViewById(R.id.mode);

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            aSwitch.setChecked(true);
        }
            aSwitch.setOnCheckedChangeListener((compoundButton, b) -> {
                if(b){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast.makeText(MainActivity.this,"Dark mode",Toast.LENGTH_SHORT).show();
                    reset();
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    Toast.makeText(MainActivity.this,"Light mode",Toast.LENGTH_SHORT).show();
                    reset();
                }
            });

*/


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menubar,menu);
        return true;
    }
    @SuppressLint("NonConstantResourceId")
    public  boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.exit:
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you Want to Exit");
                builder.setCancelable(true);
                builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setPositiveButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
                return true;
            case R.id.share:
                ApplicationInfo api = getApplicationContext().getApplicationInfo();
                String apkpath = api.publicSourceDir;
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(apkpath));
                startActivity(Intent.createChooser(intent,"shareVia"));
                return true;
            case R.id.stop:
                Intent intent1=new Intent(MainActivity.this,stopwatch.class);
                startActivity(intent1);
                return true;
            case R.id.binary:
                Intent intent3=new Intent(MainActivity.this,binary.class);
                startActivity(intent3);
                return true;
            case R.id.cel:
                Intent intent5=new Intent(MainActivity.this,celsius.class);
                startActivity(intent5);
                return true;
            case R.id.cal1:
                Intent intent6=new Intent(MainActivity.this,calculator.class);
                startActivity(intent6);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /*
    private void  reset(){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }*/
}