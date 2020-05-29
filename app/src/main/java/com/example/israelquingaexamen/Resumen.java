package com.example.israelquingaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    TextView nombre, mensu, verCentro;
    Bundle reNombre, reMensu, reCentro;

    TextView tenis, fut, bas;
    Bundle reTenis, reFut, reBas;

    TextView selec;
    Bundle reselect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        nombre = findViewById(R.id.tvNombreR);
        mensu = findViewById(R.id.tvMensuR);
        verCentro =findViewById(R.id.tvVerCentro);

        tenis = findViewById(R.id.tvVerTenis);
        fut = findViewById(R.id.tvVerFut);
        bas = findViewById(R.id.tvVerbas);

        selec = findViewById(R.id.tvVerIdioma);

        reNombre = getIntent().getExtras();
        reMensu = getIntent().getExtras();
        reCentro = getIntent().getExtras();

        reTenis = getIntent().getExtras();
        reFut = getIntent().getExtras();
        reBas = getIntent().getExtras();

        reselect = getIntent().getExtras();

        String rNombre = reNombre.getString("enNom");
        nombre.setText(rNombre);

        String rmensual = reMensu.getString("enMen");
        mensu.setText(rmensual);

        String rCentro = reCentro.getString("descrip");
        verCentro.setText(rCentro);

        String rTenis = reTenis.getString("cbUnoEn");
        tenis.setText(rTenis);
        String rFut= reFut.getString("cbDosEn");
        fut.setText(rFut);
        String rBas = reBas.getString("cbTresEn");
        bas.setText(rBas);

        String rSele = reselect.getString("si");
        selec.setText(rSele);
    }
}
