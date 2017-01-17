package com.example.mario.aprender;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);

        Button elefante = (Button) findViewById(R.id.elefante);
        Button leon = (Button) findViewById(R.id.leon);
        elefante.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                elefante();
            }

        });

        leon.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                leon();
            }

        });

    }

    public void elefante() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.elefante);
        mp.start();
    }
    public void leon() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
        mp.start();
    }
}
