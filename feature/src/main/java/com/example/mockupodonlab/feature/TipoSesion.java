package com.example.mockupodonlab.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TipoSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tipo_sesion);
    }

    public void inicioquiz (View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

}
