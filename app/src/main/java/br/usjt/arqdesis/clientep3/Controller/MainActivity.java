package br.usjt.arqdesis.clientep3.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

import br.usjt.arqdesis.clientep3.Model.Cliente;
import br.usjt.arqdesis.clientep3.Model.ClienteRequester;
import br.usjt.arqdesis.clientep3.R;


public class MainActivity extends AppCompatActivity {
    private EditText nome;
    public static final String CHAVE = "br.usjt.arqdesis.clientep2.lista";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText)findViewById(R.id.busca_nome_cliente);

    }

    public void buscarClientes(View view){
        ClienteRequester requester = new ClienteRequester();
        String chave = nome.getText().toString();
        ArrayList<Cliente> lista = requester.getClientes("localhost:8080/arquidesis_poetas/clientes",chave);
        Intent intent = new Intent(this, ListaClientesActivity.class);
        String chave = nome.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }


}
