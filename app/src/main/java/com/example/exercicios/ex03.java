package com.example.exercicios;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ex03 extends AppCompatActivity {

    private EditText etNome, etIdade, etUF, etCidade, etTelefone, etEmail;
    private RadioGroup rgTamanho;
    private CheckBox cbPreto, cbBranco, cbAzul, cbVermelho;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex03);

        inicializarComponentes();
        btnSalvar.setOnClickListener(v -> salvarCadastro());
    }

    private void inicializarComponentes() {
        etNome = findViewById(R.id.etNome);
        etIdade = findViewById(R.id.etIdade);
        etUF = findViewById(R.id.etUF);
        etCidade = findViewById(R.id.etCidade);
        etTelefone = findViewById(R.id.etTelefone);
        etEmail = findViewById(R.id.etEmail);
        btnSalvar = findViewById(R.id.btnSalvar);
    }

    private void salvarCadastro() {
        String nome = etNome.getText().toString().trim();
        String idade = etIdade.getText().toString().trim();
        String uf = etUF.getText().toString().trim();
        String cidade = etCidade.getText().toString().trim();
        String telefone = etTelefone.getText().toString().trim();
        String email = etEmail.getText().toString().trim();

        if (verificarCamposVazios(nome, idade, uf, cidade, telefone, email)) return;

        exibirMensagem(formatarMensagem(nome, idade, uf, cidade, telefone, email));
    }

    private boolean verificarCamposVazios(String... campos) {
        for (String campo : campos) {
            if (campo.isEmpty()) {
                exibirMensagem("Por favor, preencha todos os campos.");
                return true;
            }
        }
        return false;
    }

    private String formatarMensagem(String nome, String idade, String uf, String cidade, String telefone, String email) {
        return String.format(
                "Cadastro salvo:\nNome: %s\nIdade: %s\nUF: %s\nCidade: %s\nTelefone: %s\nEmail: %s",
                nome, idade, uf, cidade, telefone, email
        );
    }

    private void exibirMensagem(String mensagem) {
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }
}
