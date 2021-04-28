package com.example.geoquiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InitActivity extends AppCompatActivity {

    private Button americaBtn;
    private Button asiaBtn;
    private Button euroBtn;
    private Button randomBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);

        americaBtn = findViewById(R.id.america_button);
        americaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this, NorthActivity.class);
                startActivity(intent);
            }
        });

        asiaBtn = findViewById(R.id.asia_button);
        asiaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this, asiaActivity.class);
                startActivity(intent);
            }
        });

        euroBtn = findViewById(R.id.europe_button);
        euroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this, euroActivity.class);
                startActivity(intent);
            }
        });

        randomBtn = findViewById(R.id.random_button);
        randomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}