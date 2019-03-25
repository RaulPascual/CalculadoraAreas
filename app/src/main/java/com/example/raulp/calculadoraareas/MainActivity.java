package com.example.raulp.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button calculadora1;
        Button calculadoracirculos;
        Button calculadorarectangulos;
        Button calculadoracuadrados;
        Button calculadorarombos;
        Button calculadoratriangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculadora1 = (Button)findViewById(R.id.calculadora1);

        calculadora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CalculadoraNormal.class);
                startActivity(intent);
            }
        });

        calculadoracirculos = (Button)findViewById(R.id.calculadoracirculos);

        calculadoracirculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraCirculos.class);
                startActivity(intent);
            }
        });

        calculadorarectangulos = (Button)findViewById(R.id.calculadorarectangulos);
        calculadorarectangulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraRectangulos.class);
                startActivity(intent);
            }
        });

        calculadoracuadrados = (Button)findViewById(R.id.calculadoracuadrados);
        calculadoracuadrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraCuadrados.class);
                startActivity(intent);
            }
        });

        calculadorarombos = (Button)findViewById(R.id.calculadorarombo);
        calculadorarombos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraRombos.class);
                startActivity(intent);
            }
        });

        calculadoratriangulo = (Button)findViewById(R.id.calculadoratriangulo);
        calculadoratriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraTriangulo.class);
                startActivity(intent);
            }
        });
    }

}
