package com.example.mockupodonlab.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Diagnosticos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnosticos);
    }

    public void iraGripe (View view) {
        Intent intentn = new Intent(this, Gripe.class);
        startActivity(intentn);
    }
}
