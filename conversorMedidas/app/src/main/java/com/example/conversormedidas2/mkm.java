package com.example.conversormedidas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mkm extends AppCompatActivity {

    EditText edtDigite2Prog;
    EditText edtResultado2Prog;
    Button btnConverterMKmProg;
    Button btnNovoMKmProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkm);

        getSupportActionBar().hide();

        edtDigite2Prog = (EditText) findViewById(R.id.edtDigite2);
        edtResultado2Prog = (EditText) findViewById(R.id.edtResultado2);
        btnConverterMKmProg = (Button) findViewById(R.id.btnConverterMKm);
        btnConverterMKmProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtDigite2Prog.getText().toString());
                double km = m / 1000;
                edtResultado2Prog.setText(String.valueOf(km));
            }
        });

        btnNovoMKmProg = (Button) findViewById(R.id.btnNovoMKm);
        btnNovoMKmProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDigite2Prog.setText("");
                edtResultado2Prog.setText("");
                edtDigite2Prog.requestFocus();

            }
        });

    }
}