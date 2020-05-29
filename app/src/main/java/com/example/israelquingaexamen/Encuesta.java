package com.example.israelquingaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    EditText descri;
    CheckBox cUno, cDos, cTres;
    RadioButton rUno, rDos;

    TextView nomb, men;
    Bundle reNomb, reMen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        descri = findViewById(R.id.etCentro);

        cUno = findViewById(R.id.cbTenis);
        cDos = findViewById(R.id.cbFut);
        cTres = findViewById(R.id.cbBas);

        rUno = findViewById(R.id.rbSi);
        rDos = findViewById(R.id.rbNo);

        nomb = findViewById(R.id.verNombre);
        men = findViewById(R.id.verMensual);

        reNomb = getIntent().getExtras();
        reMen= getIntent().getExtras();

        String rNomb= reNomb.getString("nom");
        nomb.setText(rNomb);
        String rMen = reMen.getString("mensu");
        men.setText(rMen);
    }

    public void guardar(View v){
        Intent pasResumen = new Intent(Encuesta.this, Resumen.class);

        pasResumen.putExtra("enNom", nomb.getText().toString());
        pasResumen.putExtra("enMen", men.getText().toString());

        pasResumen.putExtra("descrip", descri.getText().toString());

        if (cUno.isChecked()==true){
            pasResumen.putExtra("cbUnoEn", cUno.getText().toString());
        }
        if (cDos.isChecked()==true){
            pasResumen.putExtra("cbDosEn", cDos.getText().toString());
        }
        if (cTres.isChecked()==true){
            pasResumen.putExtra("cbTresEn", cTres.getText().toString());
        }
        if (rUno.isChecked()==true){
            pasResumen.putExtra("si", rUno.getText().toString());
        }
        if (rDos.isChecked()==true){
            pasResumen.putExtra("si", rDos.getText().toString());
        }



        startActivity(pasResumen);
    }
}
