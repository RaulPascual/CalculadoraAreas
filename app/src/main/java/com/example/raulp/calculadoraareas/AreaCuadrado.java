package com.example.raulp.calculadoraareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaCuadrado extends AppCompatActivity implements View.OnClickListener {
    EditText lado;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_cuadrado);

        lado = (EditText) findViewById(R.id.lado);
        calcular = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(this);

    }


    public void onClick(View v) {

        String lado1 = lado.getText().toString();
        double ladodouble = Double.parseDouble(lado1);
        double rta=0;
        double pi = 3.1415;
        rta = ladodouble * ladodouble;

        resultado.setText(rta+"");

    }
}
