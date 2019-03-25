package com.example.raulp.calculadoraareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PeriCirculo extends AppCompatActivity implements View.OnClickListener {
    EditText radio;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peri_circulo);

        radio = (EditText) findViewById(R.id.radio);
        calcular = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(this);

    }


    public void onClick(View v) {

    String radio1 = radio.getText().toString();
    Double radioent = Double.parseDouble(radio1);
        double rta=0;
        double pi = 3.1415;
        rta = 2 *pi * radioent;

    resultado.setText(rta+"");

}
}
