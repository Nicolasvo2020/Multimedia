package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FormularioActivity2 extends AppCompatActivity {

    ImageButton btnGrito;
    Button btnForm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario2);

        btnGrito = (ImageButton) findViewById(R.id.btnGrito);
        btnForm1 = (Button) findViewById(R.id.btnForm1);
        //Reproducir el MP3
        btnGrito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Gritar();
            }
        });
        btnForm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Form1 = new Intent(FormularioActivity2.this, MainActivity.class);
                startActivity(Form1);
            }
        });
    }
    private void Gritar(){
        MediaPlayer mpGrito = MediaPlayer.create( FormularioActivity2.this, R.raw.risas);
        mpGrito.start();
    }

}