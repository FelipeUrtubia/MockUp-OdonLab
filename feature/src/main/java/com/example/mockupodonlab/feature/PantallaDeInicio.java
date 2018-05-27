package com.example.mockupodonlab.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PantallaDeInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_inicio);
    }

    public void iniciosesion (View view) {
        Intent intent;
        intent = new Intent(this, tipoSesion.class);
        startActivity(intent);
    }

}
