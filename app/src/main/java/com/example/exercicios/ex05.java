package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ex05 extends AppCompatActivity {

    private CheckBox cbNotificacoes, cbModoEscuro, cbLembrarLogin;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex05);

        cbNotificacoes = findViewById(R.id.cbNotificacoes);
        cbModoEscuro = findViewById(R.id.cbModoEscuro);
        cbLembrarLogin = findViewById(R.id.cbLembrarLogin);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> salvarPreferencias());
    }

    private void salvarPreferencias() {
        StringBuilder preferencias = new StringBuilder();

        if (cbNotificacoes.isChecked()) {
            preferencias.append("Receber notificações\n");
        }
        if (cbModoEscuro.isChecked()) {
            preferencias.append("Modo escuro\n");
        }
        if (cbLembrarLogin.isChecked()) {
            preferencias.append("Lembrar login\n");
        }

        if (preferencias.length() > 0) {
            Toast.makeText(this, preferencias.toString(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
        }
    }
}
