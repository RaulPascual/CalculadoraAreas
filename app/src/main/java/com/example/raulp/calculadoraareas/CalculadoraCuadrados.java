package com.example.raulp.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraCuadrados extends AppCompatActivity {
    Button pericuadrado, areacuadrado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_cuadrados);

       pericuadrado = (Button)findViewById(R.id.pericuadrado);
        pericuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraCuadrados.this, PeriCuadrado.class);
                startActivity(intent);
            }
        });

        areacuadrado = (Button)findViewById(R.id.areacuadrado);
        areacuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraCuadrados.this, AreaCuadrado.class);
                startActivity(intent);
            }
        });
    }
}
