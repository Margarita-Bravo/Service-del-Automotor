package com.example.service_del_automotor.utilidades;

public class Utilidades {
    //Constantes campos tabla usuario
    public static final String TABLA_CLIENTE="cliente";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_TELEFONO="telefono";
    public static final String CAMPO_PROVINCIA="provincia";
    public static final String CAMPO_CALLE="calle";
    public static final String CAMPO_ALTURA="altura";
    public static final String CAMPO_LOCALIDAD="localidad";

    public static final String CREAR_TABLA_CLIENTE="CREATE TABLE " + TABLA_CLIENTE+"("+CAMPO_ID+" INTEGER PRIMARY KEY, "+CAMPO_NOMBRE+" TEXT, "+ CAMPO_APELLIDO+" TEXT, "+CAMPO_TELEFONO+" TEXT, "+CAMPO_PROVINCIA+" TEXT,"+ CAMPO_CALLE+" TEXT, "+CAMPO_ALTURA+" INTEGER, "+CAMPO_LOCALIDAD+" TEXT)";
}
