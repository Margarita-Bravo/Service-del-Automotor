package com.example.service_del_automotor;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class ListadoUsuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_usuarios);
    }
        public void btnRegistrar(View view) {
            Intent intent = new Intent(this, RegistroCliente.class);
            startActivity(intent);

    }
}