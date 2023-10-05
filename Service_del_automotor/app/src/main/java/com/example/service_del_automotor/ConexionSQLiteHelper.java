package com.example.service_del_automotor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.service_del_automotor.utilidades.Utilidades;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NOMBRE="servicioAutomotor1";
    private static final String TABLE_USUARIO="usuario";
    public static final String TABLE_CLIENTE="cliente";
    public static final String TABLE_ADMINISTRADOR="administrador";


    private static String idUsuario="idUsuario";
    private static String idCliente="idCliente";
    private static String idAdmin="idAdmin";
    private static String nombre="nombre";
    private static String nombreAdmin="nombreAdmin";
    private static String apellido="apellido";
    private static String correo="correo";
    private static String password="password";
    private static String telefono="telefono";
    private static String calle="calle";
    private static String altura="altura";
    private static String localidad="localidad";
    private static String provincia="provincia";

    private static String usuarioId= "usuarioId";

    public ConexionSQLiteHelper(@Nullable Context context, String servicioAutomotor, Object o, int i){
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_USUARIO+ "(" +
                idUsuario+" integer primary key autoincrement, " +
                correo+" text not null, "+
                password+" text not null"+
                ")");

        db.execSQL("CREATE TABLE "+ TABLE_CLIENTE+ "(" +
                idCliente+" integer primary key autoincrement, " +
                nombre+" text not null, "+
                apellido+" text not null, "+
                telefono+" text not null, "+
                calle+" text not null, "+
                altura+" integer not null, "+
                localidad+" text not null, "+
                provincia+" text not null, "+
                usuarioId+" integer REFERENCES "+ TABLE_USUARIO+"("+idUsuario+")"+
                ")");

        db.execSQL("CREATE TABLE "+ TABLE_ADMINISTRADOR+"(" +
                idAdmin+" integer primary key autoincrement, " +
                nombreAdmin+" text not null, "+
                usuarioId+" integer REFERENCES "+ TABLE_USUARIO+"("+idUsuario+")"+
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(("DROP TABLE "+ TABLE_USUARIO));
        db.execSQL(("DROP TABLE "+ TABLE_CLIENTE));
        db.execSQL(("DROP TABLE "+ TABLE_ADMINISTRADOR));
    }


    /*
    final String CREAR_TABLA_CLIENTE= "CREATE TABLE cliente(id INTEGER, nombre TEXT, apellido TEXT, telefono TEXT, provincia TEXT, calle TEXT, altura INTEGER, localidad TEXT)";
    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_CLIENTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS cliente");
        onCreate(db);
    }
     */
}
