package com.example.raulp.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculadoraRombos extends AppCompatActivity {
    Button perirombo, arearombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_rombos);

        perirombo = (Button)findViewById(R.id.perirombo);
        perirombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraRombos.this, PeriRombo.class);
                startActivity(intent);
            }
        });

        arearombo = (Button)findViewById(R.id.arearombo);
        arearombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraRombos.this, AreaRombo.class);
                startActivity(intent);
            }
        });
    }
}
