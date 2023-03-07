package com.example.my_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pez_bailarina extends AppCompatActivity implements View.OnClickListener {
    private Button botonAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pez_bailarina);
        botonAtras = (Button) findViewById(R.id.button2);
        botonAtras.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent main_activity = new Intent(this, MainActivity.class);
        startActivity(main_activity);
    }
}