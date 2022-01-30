package com.example.conversormedidas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mcm extends AppCompatActivity {

    EditText edtDigite3Prog;
    EditText edtResultado3Prog;
    Button btnConverterMCmprog;
    Button btnNovoMCmProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);

        getSupportActionBar().hide();

        edtDigite3Prog = (EditText) findViewById(R.id.edtDigite3);
        edtResultado3Prog = (EditText) findViewById(R.id.edtResultado3);
        btnConverterMCmprog = (Button) findViewById(R.id.btnConverterMCm);
        btnConverterMCmprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtDigite3Prog.getText().toString());
                double cm = m * 100;
                edtResultado3Prog.setText(String.valueOf(cm));

            }
        });

        btnNovoMCmProg = (Button) findViewById(R.id.btnNovoMCm);
        btnNovoMCmProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDigite3Prog.setText("");
                edtResultado3Prog.setText("");
                edtDigite3Prog.requestFocus();
            }
        });


    }
}