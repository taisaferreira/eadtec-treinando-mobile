package com.example.conversormedidas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kmm extends AppCompatActivity {

    EditText edtDigiteProg;
    EditText edtResultadoProg;
    Button btnConverterKmMProg;
    Button btnNovoKmMProg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmm);

        getSupportActionBar().hide();

        edtDigiteProg = (EditText) findViewById(R.id.edtDigite);
        edtResultadoProg = (EditText) findViewById(R.id.edtResultado);
        btnConverterKmMProg = (Button) findViewById(R.id.btnConverterKmM);
        btnConverterKmMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km = Double.parseDouble(edtDigiteProg.getText().toString());
                double m = km * 1000;
                edtResultadoProg.setText(String.valueOf(m));
            }
        });

        btnNovoKmMProg = (Button) findViewById(R.id.btnNovoKmM);
        btnNovoKmMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDigiteProg.setText("");
                edtResultadoProg.setText("");
                edtDigiteProg.requestFocus();
            }
        });


    }
}