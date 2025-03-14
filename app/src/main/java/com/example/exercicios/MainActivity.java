package com.example.exercicios;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnEx01 = findViewById(R.id.btnEx01);
        btnEx01.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ex01.class);
            startActivity(intent);
        });

        Button btnEx02 = findViewById(R.id.btnEx02);
        btnEx02.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ex02.class);
            startActivity(intent);
        });

        Button btnEx03 = findViewById(R.id.btnEx03);
        btnEx03.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ex03.class);
            startActivity(intent);
        });

        Button btnEx04 = findViewById(R.id.btnEx04);
        btnEx04.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ex04.class);
            startActivity(intent);
        });

        Button btnEx05 = findViewById(R.id.btnEx05);
        btnEx05.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ex05.class);
            startActivity(intent);
        });
    }
}
