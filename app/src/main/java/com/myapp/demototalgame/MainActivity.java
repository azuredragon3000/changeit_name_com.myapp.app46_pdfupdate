package com.myapp.demototalgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btPongGame = findViewById(R.id.idPongGame    );

        btPongGame.setOnClickListener(v->{
            startActivity(new Intent(this,PongActivity.class));
        });
    }
}