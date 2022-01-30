package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnSobreProg = (Button) findViewById(R.id.btnSobre);

        btnSobreProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(menu.this, sobre.class);
                startActivity(it);


            }
        });

        Button btnTelefoneProg = (Button) findViewById(R.id.btnTelefone);

        btnTelefoneProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(menu.this, telefone.class);
                startActivity(it);
            }
        });


    }
}
