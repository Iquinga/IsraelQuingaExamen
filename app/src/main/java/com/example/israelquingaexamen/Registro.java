package com.example.israelquingaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {
    EditText monto, nombre;
    TextView mensual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.etNombre);
        monto = (EditText)findViewById(R.id.etMonto);
        mensual = findViewById(R.id.tvMensual);

    }

    public void calculo(View v){
        double inMonto = Double.parseDouble(monto.getText().toString());
        double resultado;

        double porcentaje;
        porcentaje = inMonto*0.05;

        resultado = (((1800-inMonto)/3)+porcentaje);

        mensual.setText(String.valueOf(resultado));
    }

    public void guardarReg(View v){

        Intent abrirEncu = new Intent(this, Encuesta.class);
        abrirEncu.putExtra("nom", nombre.getText().toString());
        abrirEncu.putExtra("mensu", mensual.getText().toString());
        startActivity(abrirEncu);
    }
}
