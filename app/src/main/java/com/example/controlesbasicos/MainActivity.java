package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Siguiente =(Button)findViewById(R.id.Siguiente);

// Crear objetos que enlazan con los componentes
        final EditText tNombre = (EditText)this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText)this.findViewById(R.id.etApellido);
        Button bDatos = (Button)this.findViewById(R.id.btEnviarDatos);

// Crear el método Clic para el botón
        bDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
// Crear las variables que reciben los datos
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();

// Primera salida utilizando Toast
                Toast.makeText(getApplicationContext(),"Tu nombre es: "+nom+" "+ape,Toast.LENGTH_LONG).show();
            }
        });

        //cambio de pantalla
        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( MainActivity.this, Determinar.class);
                startActivity(i);
            }
        });
    }
}
