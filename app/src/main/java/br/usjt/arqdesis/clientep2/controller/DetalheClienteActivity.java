package br.usjt.arqdesis.clientep2.controller;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import br.usjt.arqdesis.clientep2.R;
import br.usjt.arqdesis.clientep2.model.Util;

public class DetalheClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListaClientesActivity.NOME);
        String email = intent.getStringExtra(ListaClientesActivity.EMAIL);
        String fone = intent.getStringExtra(ListaClientesActivity.FONE);
        String foto = intent.getStringExtra(ListaClientesActivity.FOTO);

        ImageView fotoCliente = (ImageView)findViewById(R.id.detalhe_foto_cliente);
        TextView nomeCliente = (TextView)findViewById(R.id.detalhe_nome_cliente);
        TextView foneCliente = (TextView)findViewById(R.id.txt_detalhe_fone_cliente);
        TextView emailCliente = (TextView)findViewById(R.id.txt_detalhe_email_cliente);

        nomeCliente.setText(nome);
        foneCliente.setText(fone);
        emailCliente.setText(email);

        Drawable imagem = Util.getDrawable(this, foto);
        fotoCliente.setImageDrawable(imagem);
    }
}
