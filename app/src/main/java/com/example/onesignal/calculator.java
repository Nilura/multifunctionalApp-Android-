package com.example.onesignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bdot, Ans, bpower, AC, bback,Equal;
    private TextView Screen;
    private String input,Answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_UNSPECIFIED) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_OneSignal);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        badd = findViewById(R.id.btnadd);
        bsub = findViewById(R.id.btnsub);
        bmul = findViewById(R.id.btnmul);
        bdiv = findViewById(R.id.btndiv);
        bdot = findViewById(R.id.btndot);
        // Ans = findViewById(R.id.ans);
        bback = findViewById(R.id.back);
        bpower = findViewById(R.id.power);
        AC = findViewById(R.id.ac);
        Screen = findViewById(R.id.screen);
        Equal=findViewById(R.id.equal);
    }
    public void ButtonClick(View view){
        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data) {

            case "AC":
                input = "";
                break;
            case "Ans":
                input += Answer;
                break;
            case "*":
                input += "*";
                break;
            case "^":
                input += "^";
                break;
            case "=":
                Solve();
                Answer=input;
                break;
            case "c":
                try{
                    String newText = input.substring(0, input.length() - 1);
                    input = newText;
                    break;
                }
                catch (Exception e){
                    Toast.makeText(calculator.this,"Empty",Toast.LENGTH_SHORT).show();
                }
            default:
                if (input == null) {
                    input = " ";
                }
                if (data.equals("+") || data.equals("-") || data.equals("/")) {
                    Solve();
                }
                input += data;

        }
        Screen.setText(input);
    }

    private void Solve() {
        if(input.split("\\*").length==2){
            String number[] =input.split("\\*") ;
            try{

                double mul=Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                input=mul+"";
            }
            catch(Exception e){

            }

        }
        else if(input.split("/").length==2){

            String[] number =input.split("/") ;
            try{

                double div=Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                input=div+"";
            }
            catch(Exception e){

            }

        }

        else if(input.split("\\^").length==2){

            String[] number =input.split("\\^") ;
            try{

                double pow=Math.pow(Double.parseDouble(number[0]),Double.parseDouble(number[1]));
                input=pow+"";
            }
            catch(Exception e){

            }

        }
        else if(input.split("\\+").length==2){

            String[] number =input.split("\\+") ;
            try{

                double sum=Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                input=sum+"";
            }
            catch(Exception e){

            }

        }

        else if(input.split("-").length>1){
            String[] number =input.split("-") ;
            if(number[0] == " " && number.length==2){
                number[0]=0+" ";
            }

            try{
                double sub=0;
                if(number.length==2){
                    sub=Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                }
                else if(number.length==3){
                    sub=Double.parseDouble(number[1])-Double.parseDouble(number[2]);
                }

                input=sub+ "";
            }
            catch(Exception e){

            }

        }
        String  n[] =input.split(" \\. ");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }
        Screen.setText(input);
    }
}