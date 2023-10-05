package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button AcBoton = (Button) findViewById(R.id.AcBoton);
        AcBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ETNombre = (EditText) findViewById(R.id.txtNombre);
                String StNombre = ETNombre.getText().toString();

                Intent sIntent = new Intent(MainActivity.this, Activityv2.class);
                sIntent.putExtra("STNombre", StNombre);
                startActivity(sIntent);
            }

        });


    }



}