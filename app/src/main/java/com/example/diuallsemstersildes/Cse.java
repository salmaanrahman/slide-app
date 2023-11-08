package com.example.diuallsemstersildes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cse extends AppCompatActivity {
    Button button108;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        button108 = findViewById(R.id.button108);

        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Cse.this, Economics.class);
                startActivity(myIntent);
            }
        });
    }
}