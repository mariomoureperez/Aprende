package com.example.mario.aprender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button letras=(Button) findViewById(R.id.letras);
        Button numeros=(Button) findViewById(R.id.numeros);
        Button cosas=(Button) findViewById(R.id.cosas);
        Button musica=(Button) findViewById(R.id.musica);
        Button colores=(Button) findViewById(R.id.colores);
        Button animales=(Button) findViewById(R.id.animales);

       letras.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                letras();
                    }

        });


    }





    public void letras(){

        //Iniciando la actividad Visor
        Intent intent = new Intent(this,Letras.class);
        startActivity(intent);

    }


}
