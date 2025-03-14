package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ex02 extends AppCompatActivity {

    private EditText etValor1, etValor2;
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex02);

        etValor1 = findViewById(R.id.etValor1);
        etValor2 = findViewById(R.id.etValor2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        tvResultado = findViewById(R.id.tvResultado);

        btnSomar.setOnClickListener(v -> calcularOperacao('+'));
        btnSubtrair.setOnClickListener(v -> calcularOperacao('-'));
        btnMultiplicar.setOnClickListener(v -> calcularOperacao('*'));
        btnDividir.setOnClickListener(v -> calcularOperacao('/'));
    }

    private void calcularOperacao(char operacao) {
        String valor1Str = etValor1.getText().toString().trim();
        String valor2Str = etValor2.getText().toString().trim();

        if (valor1Str.isEmpty() || valor2Str.isEmpty()) {
            tvResultado.setText("Por favor, preencha todos os campos.");
            return;
        }

        double valor1 = Double.parseDouble(valor1Str);
        double valor2 = Double.parseDouble(valor2Str);
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    tvResultado.setText("Divisão por zero não é permitida.");
                    return;
                }
                break;
        }

        tvResultado.setText("Resultado: " + resultado);
    }
}

