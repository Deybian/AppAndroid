package com.deybian.as3app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    private EditText Puertaaltura, Puertaancho;
    TextView cotizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Puertaaltura = (EditText) findViewById(R.id.txtusuario);
        Puertaancho = (EditText) findViewById(R.id.txtpassword);
        cotizar = (TextView) findViewById(R.id.respuesta);
    }

    public void cotizacion(View view) {
        int alto, ancho, precio;
        int divi=10;

        String valor1 = Puertaaltura.getText().toString();
        String valor2 = Puertaancho.getText().toString();

        alto = Integer.parseInt(valor1);
        ancho = Integer.parseInt(valor2);

        precio = (alto * ancho)/divi;

        String resultado = String.valueOf(precio);
        cotizar.setText(resultado);

    }
}

