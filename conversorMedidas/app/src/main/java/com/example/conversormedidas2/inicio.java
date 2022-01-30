package com.example.conversormedidas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        getSupportActionBar().hide();

        Button btnKmMetroProg = (Button) findViewById(R.id.btnKmMetro);
        btnKmMetroProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(inicio.this, kmm.class);
                startActivity(it);
            }
        });

        Button btnMetroKmProg = (Button) findViewById(R.id.btnMetroKm);
        btnMetroKmProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(inicio.this, mkm.class);
                startActivity(it);
            }
        });

        Button btnMetroCmProg = (Button) findViewById(R.id.btnMetroCm);
        btnMetroCmProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(inicio.this, mcm.class);
                startActivity(it);
            }
        });

        Button btnCmMetroProg = (Button) findViewById(R.id.btnCmMetro);
        btnCmMetroProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(inicio.this, cmm.class);
                startActivity(it);
            }
        });

    }
}