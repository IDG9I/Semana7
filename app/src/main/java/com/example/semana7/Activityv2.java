package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activityv2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityv2);

        TextView txtNOMBRE;

        txtNOMBRE = findViewById(R.id.txtTexto2);

        Intent intent = getIntent();

        String nombreFoto = getIntent().getStringExtra("STNombre");
        txtNOMBRE.setText(nombreFoto);


    }
}