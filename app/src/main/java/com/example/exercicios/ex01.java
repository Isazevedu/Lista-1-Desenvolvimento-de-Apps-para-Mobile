package com.example.exercicios;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ex01 extends AppCompatActivity {

    private EditText inputNome, inputIdade;
    private Button btnConfirmar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex01);

        inputNome = findViewById(R.id.inputNome);
        inputIdade = findViewById(R.id.inputIdade);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        lblResultado = findViewById(R.id.lblResultado);

        btnConfirmar.setOnClickListener(v -> {
            String nomeDigitado = inputNome.getText().toString().trim();
            String idadeDigitada = inputIdade.getText().toString().trim();

            if (nomeDigitado.isEmpty() || idadeDigitada.isEmpty()) {
                lblResultado.setText("Por favor, preencha todos os campos.");
                return;
            }

            int idade = Integer.parseInt(idadeDigitada);
            String mensagem = idade >= 18 ? nomeDigitado + ", você é maior de idade." : nomeDigitado + ", você é menor de idade.";
            lblResultado.setText(mensagem);
        });
    }
}