package com.example.israelquingaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usu, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu = findViewById(R.id.etUser);
        pass = findViewById(R.id.etPassword);
    }

    public void acceder(View v){
        Intent iniciarSis = new Intent(MainActivity.this, Registro.class);

        String usuario = usu.getText().toString();
        String contra = pass.getText().toString();

        if (usuario.equals("estudiante2020") && contra.equals("uisrael2020")){
                startActivity(iniciarSis);
        }else {
            Toast.makeText(getApplicationContext(), "Error",Toast.LENGTH_LONG).show();
        }

    }
}
