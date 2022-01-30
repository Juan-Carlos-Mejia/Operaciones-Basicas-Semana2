package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    Integer Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        TextView Nombre = (TextView)findViewById(R.id.NombreRecibe);
        TextView Edad   = (TextView)findViewById(R.id.EdadRecibe);
        TextView Estado = (TextView)findViewById(R.id.Resultado);
        Button Regresar  = (Button)findViewById(R.id.Regresar2);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String nombre = datosRecibidos.getString("pNombre");
        String edad = datosRecibidos.getString("pEdad");

        Nombre.setText("Tu nombre es: "+nombre);
        Edad.setText("Tu edad es: "+edad);

        Resultado = Integer.parseInt(edad);

        if(Resultado < 18){
            Estado.setText("Eres menor de edad");
        }else{
            Estado.setText("Eres mayor de edad");
        }

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new
                        Intent(Resultado.this,Determinar.class);
                startActivity(vuelva);
            }
        });
    }
}