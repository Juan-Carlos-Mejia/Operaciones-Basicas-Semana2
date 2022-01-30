package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Determinar extends AppCompatActivity {


    Button Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinar);
        Regresar =(Button)findViewById(R.id.Regresar);


        final EditText eNombre = (EditText)findViewById(R.id.Nombre);
        final EditText eEdad = (EditText)findViewById(R.id.Edad);
        Button EnviarDatos = (Button)findViewById(R.id.EnviarDatos);

        EnviarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nombre = eNombre.getText().toString();
                String Edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre",Nombre);
                pasarDatos.putString("pEdad",Edad);
                Intent siga = new
                        Intent(Determinar.this,Resultado.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( Determinar.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}