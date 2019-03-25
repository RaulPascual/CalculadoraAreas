package com.example.raulp.calculadoraareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaRectangulo extends AppCompatActivity implements View.OnClickListener {
    EditText lado1, lado2;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_rectangulo);

        lado1 = (EditText) findViewById(R.id.lado1);
        lado2 = (EditText) findViewById(R.id.lado2);
        calcular = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(this);

    }


    public void onClick(View v) {

        String base1 = lado1.getText().toString();
        double num2 = Double.parseDouble(base1);
        String altura1 = lado2.getText().toString();
        double num1 = Double.parseDouble(altura1);


        double rta=0;
        rta = num1 * num2;


        resultado.setText(rta+"");

    }
}
