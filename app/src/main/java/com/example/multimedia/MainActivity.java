package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnGato, btnPerro;
    Button btnForm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGato = (ImageButton) findViewById(R.id.btnGato);
        btnPerro = (ImageButton) findViewById(R.id.btnPerro);
        btnForm2 = (Button) findViewById(R.id.btnForm2);

        //Reproducir el MP3
        btnGato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Maullar();
            }
            });
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ladrar();
            }
        });
        btnForm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Form2 = new Intent(MainActivity.this, FormularioActivity2.class);
                startActivity(Form2);
            }
        });

    }
    private void Maullar(){
        MediaPlayer mpGato = MediaPlayer.create( MainActivity.this, R.raw.miau);
        mpGato.start();
    }
    private void Ladrar(){
        MediaPlayer mpPerro = MediaPlayer.create( MainActivity.this, R.raw.ladra);
        mpPerro.start();
    }
}