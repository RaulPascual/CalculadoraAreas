package com.example.raulp.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculadoraTriangulo extends AppCompatActivity {
    Button peritrian, areatrian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_triangulo);

        peritrian = (Button)findViewById(R.id.peritrian);
        peritrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraTriangulo.this, PeriTriangulo.class);
                startActivity(intent);
            }
        });
        areatrian = (Button)findViewById(R.id.areatrian);
        areatrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraTriangulo.this, AreaTriangulo.class);
                startActivity(intent);
            }
        });
    }
}
