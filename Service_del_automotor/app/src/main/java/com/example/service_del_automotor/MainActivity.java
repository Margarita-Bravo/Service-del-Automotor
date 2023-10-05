package com.example.service_del_automotor;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"servicioAutomotor1",null,1);

        SQLiteDatabase db = conn.getWritableDatabase();
    }

    public void buttonLogin(View view) {
        Intent intent = new Intent(this, IniciarSesion.class);
        startActivity(intent);
    }

    public void textRegister(View view) {
        Intent intent = new Intent(this, Registrarse.class);
        startActivity(intent);
    }
}