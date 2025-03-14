package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class ex04 extends AppCompatActivity {

    private EditText etNome;
    private Button btnConfirmar;
    private LinearLayout llCheckBoxContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex04);

        etNome = findViewById(R.id.etNome);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        llCheckBoxContainer = findViewById(R.id.llCheckBoxContainer);

        btnConfirmar.setOnClickListener(v -> {
            llCheckBoxContainer.removeAllViews();

            String nome = etNome.getText().toString().trim();

            if (!nome.isEmpty()) {
                for (char letra : nome.toCharArray()) {
                    CheckBox checkBox = new CheckBox(this);
                    checkBox.setText(String.valueOf(letra)); // Define o texto do CheckBox como a letra
                    llCheckBoxContainer.addView(checkBox); // Adiciona o CheckBox ao container
                }
            } else {
                etNome.setError("Por favor, digite um nome.");
            }
        });
    }
}