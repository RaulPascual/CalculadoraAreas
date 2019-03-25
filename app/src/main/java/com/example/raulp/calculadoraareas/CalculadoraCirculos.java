package com.example.raulp.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculadoraCirculos extends AppCompatActivity {

Button calculadoraarea, calcularperimetro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_circulos);

        calculadoraarea = (Button)findViewById(R.id.calculadoraarea);
        calculadoraarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraCirculos.this, AreaCirculo.class);
                startActivity(intent);
            }
        });

        calcularperimetro = (Button)findViewById(R.id.calcularperimetro);
        calcularperimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraCirculos.this, PeriCirculo.class);
                startActivity(intent);
            }
        });
    }


}
