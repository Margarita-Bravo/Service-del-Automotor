package com.example.service_del_automotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }

    // public void buttonRegister(View view) {
     //   Intent intent = new Intent(this, Dashboard.class);
     //   startActivity(intent);
   // }

    public void textLogin(View view) {
        Intent intent = new Intent(this, IniciarSesion.class);
        startActivity(intent);
    }
}