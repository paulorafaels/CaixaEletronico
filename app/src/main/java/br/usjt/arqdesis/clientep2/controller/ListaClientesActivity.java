package br.usjt.arqdesis.clientep2.controller;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import br.usjt.arqdesis.clientep2.R;
import br.usjt.arqdesis.clientep2.model.Cliente;
import br.usjt.arqdesis.clientep2.model.ClienteAdapter;
import br.usjt.arqdesis.clientep2.model.Data;

public class ListaClientesActivity extends AppCompatActivity {
    public static final String NOME = "br.usjt.arqdesis.clientep2.nome";
    public static final String EMAIL = "br.usjt.arqdesis.clientep2.email";
    public static final String FONE = "br.usjt.arqdesis.clientep2.fone";
    public static final String FOTO = "br.usjt.arqdesis.clientep2.foto";
    Cliente[] clientes;
    Activity contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        contexto = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        clientes = Data.buscaClientes(chave);
        ListView listView = (ListView)findViewById(R.id.Lista_clientes);
        BaseAdapter adapter = new ClienteAdapter(this, clientes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent1 = new Intent(contexto, DetalheClienteActivity.class);
                intent1.putExtra(NOME, clientes[i].getNome());
                intent1.putExtra(FONE, clientes[i].getFone());
                intent1.putExtra(EMAIL, clientes[i].getEmail());
                intent1.putExtra(FOTO, clientes[i].getFoto());
                startActivity(intent1);
            }
        });
    }
}
