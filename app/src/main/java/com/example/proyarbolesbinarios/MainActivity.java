package com.example.proyarbolesbinarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar (View v){
        Intent intent = new Intent(this, UnoActivity.class);
        startActivity(intent);
    }
    public void euler (View v){
        Intent intent = new Intent(this, UnoActivity.class);
        startActivity(intent);
    }
    public void preOrden (View v){
        Intent intent = new Intent(this, UnoActivity.class);
        startActivity(intent);
    }
    public void inOrder (View v){
        Intent intent = new Intent(this, UnoActivity.class);
        startActivity(intent);
    }
    public void postOrder (View v){
        Intent intent = new Intent(this, UnoActivity.class);
        startActivity(intent);
    }
    public void salir (View v){
        finish();
    }
}
