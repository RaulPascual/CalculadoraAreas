package com.example.raulp.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculadoraRectangulos extends AppCompatActivity {
    Button perirecta, arearecta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_rectangulos);

        perirecta = (Button)findViewById(R.id.perirecta);
        perirecta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraRectangulos.this, PeriRectangulo.class);
                startActivity(intent);
            }
        });

        arearecta = (Button)findViewById(R.id.arearecta);
        arearecta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraRectangulos.this, AreaRectangulo.class);
                startActivity(intent);
            }
        });
    }
}
