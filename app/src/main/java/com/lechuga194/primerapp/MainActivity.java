package com.lechuga194.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etHello = findViewById(R.id.etHello);
        Button btHello = findViewById(R.id.btHello);

        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hello = etHello.getText().toString();
                if(!hello.isEmpty()) {
                    //Intent sirve para llamar a otra actividad
                    Intent intent = new Intent(MainActivity.this, HelloActivity.class);
                    intent.putExtra("msgHello", hello); //Pasamos la variable a la siguiente actividad
                    startActivity(intent); //Iniciamos la transicion de actividad
                }
            }
        });

    }
}