package arqdesis.usjt.br.clientep1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



class DetalheClienteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalha_clientes);
        TextView nome = (TextView)findViewById(R.id.nome_selecionado);
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(ListaClientesActivity.NOME));
    }
}