package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ligação do componente da classe com os componentes da interface.
        Button btnSomarProg = (Button) findViewById(R.id.btnSomar);
        Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);
        Button btnDividirProg = (Button) findViewById(R.id.btnDividir);
        Button btnMultiplicarProg = (Button) findViewById(R.id.btnMultiplicar);
        Button btnLimparProg = (Button) findViewById(R.id.btnLimpar);
        EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
        EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
        EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);
        //Método responsável pela captura do evento de Clique no botão btnSomar
        //e execução da ação realizada após o clique.
        btnSomarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres obtidos na interface
                //gráfica.
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                //Soma e armazenamento do resultado.
                double resultado = num1 + num2;
                //Retorno para a interface gráfica do resultado.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
        //Método responsável pela captura do evento Clique no botão btnSubtrair
        btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 - num2;
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
        //Método responsável pela captura do evento Clique no botão btnDividir
        btnDividirProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 / num2;
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
        //Método responsável pela captura do evento Clique no botão btnMultiplicar
        btnMultiplicarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 * num2;
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });


        //Método responsável pela captura do evento de Clique no botão btnLimpar
        //e execução da ação realizada após o clique.
        btnLimparProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtResultadoProg.setText("");
                edtValor1Prog.setText("");
                edtValor2Prog.setText("");
                edtValor1Prog.requestFocus();
            }
        });

    }
}