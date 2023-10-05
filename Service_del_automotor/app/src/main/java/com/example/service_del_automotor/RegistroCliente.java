package com.example.service_del_automotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.service_del_automotor.utilidades.Utilidades;

public class RegistroCliente extends AppCompatActivity {

    EditText campoId,campoNombre,campoApellido,campoTelefono, campoProvincia, campoCalle, campoAltura, campoLocalidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cliente);

        campoId= (EditText) findViewById(R.id.campoId);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoApellido= (EditText) findViewById(R.id.campoApellido);
        campoTelefono= (EditText) findViewById(R.id.campoTelefono);
        campoProvincia= (EditText) findViewById(R.id.campoProvincia);
        campoCalle= (EditText) findViewById(R.id.campoCalle);
        campoAltura= (EditText) findViewById(R.id.campoAltura);
        campoLocalidad= (EditText) findViewById(R.id.campoLocalidad);
    }
        public void onClick(View view) {
            registrarUsuarios();
            //registrarUsuariosSql();
        }

        private void registrarUsuarios() {
            ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_cliente",null,1);

            SQLiteDatabase db=conn.getWritableDatabase();

            ContentValues values=new ContentValues();
            values.put(Utilidades.CAMPO_ID,campoId.getText().toString());
            values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
            values.put(Utilidades.CAMPO_APELLIDO,campoApellido.getText().toString());
            values.put(Utilidades.CAMPO_TELEFONO,campoTelefono.getText().toString());
            values.put(Utilidades.CAMPO_PROVINCIA,campoProvincia.getText().toString());
            values.put(Utilidades.CAMPO_CALLE,campoCalle.getText().toString());
            values.put(Utilidades.CAMPO_ALTURA,campoAltura.getText().toString());
            values.put(Utilidades.CAMPO_LOCALIDAD,campoLocalidad.getText().toString());

            Long idResultante=db.insert(Utilidades.TABLA_CLIENTE,Utilidades.CAMPO_ID,values);

            Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
            db.close();
        }



}