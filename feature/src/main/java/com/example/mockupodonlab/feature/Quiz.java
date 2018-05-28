package com.example.mockupodonlab.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }

    public void endQuiz (View view) {
        Intent intent = new Intent(this, EndQuiz.class);
        startActivity(intent);
    }
}
