package com.example.mockupodonlab.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EndQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_quiz);
    }

    public void endSesion (View view) {
        Intent intent = new Intent(this, TipoSesion.class);
        startActivity(intent);
    }
}
