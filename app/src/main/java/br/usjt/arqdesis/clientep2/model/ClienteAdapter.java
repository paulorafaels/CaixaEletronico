package br.usjt.arqdesis.clientep2.model;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

import br.usjt.arqdesis.clientep2.R;

/**
 * Created by Anderson on 30/09/2016.
 */
public class ClienteAdapter extends BaseAdapter {
    Cliente[] clientes;
    Activity context;

    public ClienteAdapter(Activity context, Cliente[] clientes) {
        this.context = context;
        this.clientes = clientes;
    }

    @Override
    public int getCount() {
        return clientes.length;
    }

    @Override
    public Object getItem(int i) {
        if(i >=0 && i < clientes.length)
            return clientes[i];
        else
            return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View recycledView, ViewGroup viewGroup) {
        View view = recycledView;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_cliente, viewGroup, false);
            ImageView fotoCliente = (ImageView)view.findViewById(R.id.foto_cliente);
            TextView nomeCliente = (TextView)view.findViewById(R.id.nome_cliente);
            TextView detalheCliente = (TextView)view.findViewById(R.id.detalhe_cliente);
            view.setTag(new ViewHolder(detalheCliente, fotoCliente, nomeCliente));
        }

        ViewHolder holder = (ViewHolder) view.getTag();
        holder.getNomeCliente().setText(clientes[i].getNome());
        holder.getDetalheCliente().setText(clientes[i].getFone() + " - " + clientes[i].getEmail() );

        Drawable imagem = Util.getDrawable(context,clientes[i].getFoto());
        holder.getFotoCliente().setImageDrawable(imagem);

        return view;
    }
}