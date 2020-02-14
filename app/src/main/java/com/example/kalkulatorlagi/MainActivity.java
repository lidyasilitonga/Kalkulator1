package com.example.kalkulatorlagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btn_sin,btn_cos,btn_tan,btn_csc,btn_sec,btn_cot,btn_log;
    private TextView hasil;
    private EditText angka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sin = findViewById(R.id.sin);
        btn_cos = findViewById(R.id.cos);
        btn_tan = findViewById(R.id.tan);
        btn_csc = findViewById(R.id.csc);
        btn_sec = findViewById(R.id.sec);
        btn_cot = findViewById(R.id.cot);
        btn_log = findViewById(R.id.log);
        hasil = findViewById(R.id.hasil);
        angka = findViewById(R.id.angka);
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = Math.sin(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = Math.cos(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = Math.tan(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_csc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = 1.0/Math.sin(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = 1.0/Math.cos(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = 1.0/Math.tan(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double dhasil = Math.log10(angka);

                    String sHasil = String.valueOf(dhasil);
                    hasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}


