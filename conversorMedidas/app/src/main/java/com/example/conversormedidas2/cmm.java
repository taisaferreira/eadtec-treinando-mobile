package com.example.conversormedidas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cmm extends AppCompatActivity {

    EditText edtDigite4Prog;
    EditText edtResultado4Prog;
    Button btnConverterCmMProg;
    Button btnNovoCmMProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmm);

        getSupportActionBar().hide();

        edtDigite4Prog = (EditText) findViewById(R.id.edtDigite4);
        edtResultado4Prog = (EditText) findViewById(R.id.edtResultado4);
        btnConverterCmMProg = (Button) findViewById(R.id.btnConverterCmM);
        btnConverterCmMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cm = Double.parseDouble(edtDigite4Prog.getText().toString());
                double m = cm / 100;
                edtResultado4Prog.setText(String.valueOf(m));
            }
        });

        btnNovoCmMProg = (Button) findViewById(R.id.btnNovoCmM);
        btnNovoCmMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDigite4Prog.setText("");
                edtResultado4Prog.setText("");
                edtDigite4Prog.requestFocus();
            }
        });

    }
}