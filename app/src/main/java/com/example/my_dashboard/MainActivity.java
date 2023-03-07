package com.example.my_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton boton1=(ImageButton) findViewById(R.id.imageButton2);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Pez Cirujano", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(MainActivity.this, pez_azul.class);
                startActivity(intencion);
            }
        });

        ImageButton boton2=(ImageButton) findViewById(R.id.imageButton3);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Pez Bailarina", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(MainActivity.this, pez_bailarina.class);
                startActivity(intencion);
            }
        });

        ImageButton boton3=(ImageButton) findViewById(R.id.imageButton4);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Pez Payaso", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(MainActivity.this, pez_payaso.class);
                startActivity(intencion);
            }
        });

        ImageButton boton4=(ImageButton) findViewById(R.id.imageButton5);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Pez Rojo", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(MainActivity.this, pez_rojo.class);
                startActivity(intencion);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}

